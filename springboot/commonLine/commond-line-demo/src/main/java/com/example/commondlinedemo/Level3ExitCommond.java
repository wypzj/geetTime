package com.example.commondlinedemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 卫云鹏
 * @date in 20:18 2019/12/1
 */
@Slf4j
@Order(3)
@Component
public class Level3ExitCommond implements CommandLineRunner, ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Override
    public void run(String... args) throws Exception {
        log.info("order3级别初始化启动");
        int exit = SpringApplication.exit(applicationContext);
        log.info("程序退出了，code={}",exit);
        System.exit(exit);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
