package com.example.zookeeperclientdemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 断路保护切面类
 * @author 卫云鹏
 * @date in 23:05 2019/12/5
 */
@Aspect
@Slf4j
@Component
public class CircuitBreakerAspect {
    private final static Integer THRESHOLD = 3;
    private ConcurrentMap<String,AtomicInteger> errorCounter = new ConcurrentHashMap<>();
    private ConcurrentMap<String,AtomicInteger> breakerCounter = new ConcurrentHashMap<>();


    /**
     * 环绕增强
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("execution(* com.example.zookeeperclientdemo.controller.UserController..*(..))")
    public Object doWithCircuitBreaker(ProceedingJoinPoint joinPoint){
        String signature = joinPoint.getSignature().toLongString();
        log.info("拦截：{}",signature);
        if(errorCounter.containsKey(signature)){
            if(errorCounter.get(signature).get()>THRESHOLD &&
                    breakerCounter.get(signature).get() < THRESHOLD){
                log.warn("circuit breakering,will return null, breakercounter:{} times.",
                        breakerCounter.get(signature).incrementAndGet());
                return null;
            }
        }else{
            //初始化
            errorCounter.put(signature,new AtomicInteger(0));
            breakerCounter.put(signature,new AtomicInteger(0));
        }
        //执行request请求的真正方法，执行完后再次拦截到
        try{
            Object a =joinPoint.proceed();
            log.info("{}",a);

            //成功调用后将错误次数跟熔断次数都重置0
            errorCounter.get(signature).set(0);
            breakerCounter.get(signature).set(0);
            return a;
        }catch (Throwable t) {
            log.warn("调用出现异常：{}",t.getMessage());
            errorCounter.get(signature).incrementAndGet();
            breakerCounter.get(signature).set(0);
        }

        return null;
    }

}
