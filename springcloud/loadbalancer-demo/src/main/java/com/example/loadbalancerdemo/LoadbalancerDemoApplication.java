package com.example.loadbalancerdemo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class LoadbalancerDemoApplication implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(LoadbalancerDemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
    @LoadBalanced
    @Bean
    public RestTemplate templateBuilder(RestTemplateBuilder builder){
        return builder
                .setConnectTimeout(Duration.ofMillis(100))
                .setReadTimeout(Duration.ofMillis(500))
                .build();
    }
}
