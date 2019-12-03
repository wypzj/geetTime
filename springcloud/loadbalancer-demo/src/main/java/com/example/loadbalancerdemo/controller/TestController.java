package com.example.loadbalancerdemo.controller;

import com.example.loadbalancerdemo.initclass.CustomerInitRunner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author 卫云鹏
 * @date in 16:30 2019/12/3
 */
@RestController
@Slf4j
public class TestController {
    @Autowired
    private CustomerInitRunner customerInitRunner;
    @Autowired
    private RestTemplate template;
    @GetMapping("/getList")
    public void getList(){
        ParameterizedTypeReference<List<String>> ptr = new ParameterizedTypeReference<List<String>>() {};

        ResponseEntity<List<String>> exchange = template.exchange("http://eureka-client/test/getList",
                HttpMethod.GET, null,
                ptr);
        log.info("{}",exchange.getBody());
    }
}
