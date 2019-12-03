package com.example.loadbalancerdemo.initclass;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author 卫云鹏
 * @date in 14:54 2019/12/3
 */
@Component
@Slf4j
public class CustomerInitRunner implements ApplicationRunner {
    @Autowired
    private RestTemplate template;
    @Autowired
    private DiscoveryClient discoveryClient;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        discoveryClient.getInstances("eureka-client").forEach(serviceInstance -> {
            log.info("{}",serviceInstance.getHost());
            log.info("{}",serviceInstance.getPort());
        });
        log.info("init beginning$#$%#$@$%^#");
        ParameterizedTypeReference<List<String>> ptr = new ParameterizedTypeReference<List<String>>() {};

        ResponseEntity<List<String>> exchange = template.exchange("http://eureka-client/test/getList",
                HttpMethod.GET, null,
                ptr);
        log.info("{}",exchange.getBody());
    }
}
