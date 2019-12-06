package com.example.zookeeperclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperClientDemoApplication.class, args);
    }

}
