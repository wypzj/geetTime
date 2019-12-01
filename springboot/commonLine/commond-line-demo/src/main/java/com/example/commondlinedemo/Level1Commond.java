package com.example.commondlinedemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 卫云鹏
 * @date in 20:15 2019/12/1
 */
@Slf4j
@Order(1)
@Component
public class Level1Commond implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
      log.info("order1级别初始化开始");
    }
}
