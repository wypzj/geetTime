package com.design.pattern.study.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author a small asshole
 * @version 1.0
 * @description 动态代理
 * @date 2020/3/2
 * @since 1.0
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Object realObject;

    public DynamicProxyHandler(Object realObject){
        this.realObject = realObject;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        System.out.println("代理类开始执行");
        long beginTime = System.currentTimeMillis();
        Object invoke = method.invoke(realObject, args);
        long endTime = System.currentTimeMillis();
        System.out.println("方法執行時間："+(endTime-beginTime));
        return invoke;
    }
}
