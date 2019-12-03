package com.example.consulserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulServerDemoApplication.class, args);
    }

}
