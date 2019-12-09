package com.example.configclientdemo;

import com.example.configclientdemo.config.ApplicationNameConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientDemoApplication implements ApplicationRunner {

    @Autowired
    private ApplicationNameConfig config;
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientDemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("运行的配置文件是：{}",config.getA());
    }
}
