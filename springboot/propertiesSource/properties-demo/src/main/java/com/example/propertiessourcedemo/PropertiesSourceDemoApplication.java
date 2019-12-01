package com.example.propertiessourcedemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class PropertiesSourceDemoApplication implements ApplicationRunner {

    @Value("${myapplication.name}")
    private String applicationName;
    public static void main(String[] args) {
        SpringApplication.run(PropertiesSourceDemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("加载自定义配置文件中的内容:{}",applicationName);
    }
}
