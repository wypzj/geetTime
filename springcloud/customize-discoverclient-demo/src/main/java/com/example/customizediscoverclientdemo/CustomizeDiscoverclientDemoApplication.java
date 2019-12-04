package com.example.customizediscoverclientdemo;

import com.example.customizediscoverclientdemo.support.FixDiscoveryClient;
import com.example.customizediscoverclientdemo.support.FixedServerList;
import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomizeDiscoverclientDemoApplication implements ApplicationRunner {
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public DiscoveryClient fixDiscoveryClient(){
        return new FixDiscoveryClient();
    }

    @Bean
    public ServerList<Server> fixedServerList(){
        return new FixedServerList();
    }

    @LoadBalanced
    @Bean
    public RestTemplate buildTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(CustomizeDiscoverclientDemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ParameterizedTypeReference<List<String>> ptr = new ParameterizedTypeReference<List<String>>() {};

        ResponseEntity<List<String>> exchange = restTemplate.exchange("http://eureka-client/test/getList",
                HttpMethod.GET, null,
                ptr);
    }

}
