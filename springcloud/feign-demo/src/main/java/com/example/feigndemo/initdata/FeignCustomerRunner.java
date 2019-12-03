package com.example.feigndemo.initdata;

import com.example.feigndemo.api.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 卫云鹏
 * @date in 15:55 2019/12/3
 */
@Slf4j
@Component
public class FeignCustomerRunner implements ApplicationRunner {
    @Autowired
    private TestService testService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> list = testService.getList();
        log.info("feign远程调用结果：{}",list);
    }
}
