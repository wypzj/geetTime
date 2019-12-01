package com.example.commondlinedemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 卫云鹏
 * @date in 20:17 2019/12/1
 */
@Slf4j
@Order(2)
@Component
public class Level2Commond implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
      log.info("order2级别初始化启动");
    }
}
