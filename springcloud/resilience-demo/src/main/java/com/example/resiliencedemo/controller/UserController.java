package com.example.resiliencedemo.controller;

import com.example.resiliencedemo.domain.User;
import com.example.resiliencedemo.service.UserServiceFeign;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.vavr.control.Try;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 卫云鹏
 * @date in 15:27 2019/12/8
 */
@Slf4j
@RestController
@RequestMapping("/resilience_user")
public class UserController {
    @Autowired
    private UserServiceFeign userServiceFeign;
    private CircuitBreaker circuitBreaker;

    public UserController(CircuitBreakerRegistry registry){
        circuitBreaker = registry.circuitBreaker("younguser");
    }
    @GetMapping("/getUserList")
    @io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker(name="user")
    @Bulkhead(name="user")
    public List<User> getUserList(){
        return userServiceFeign.getUserList();
    }

    @GetMapping("/getYoungUserList")
    public List<User> getYoungUserList(){
        return Try.ofSupplier(
                CircuitBreaker.decorateSupplier(circuitBreaker,()->userServiceFeign.getYoungUserList()))
                .recover(CallNotPermittedException.class, Collections.emptyList())
                .get();
    }
}
