package com.example.hystrixdemo.controller;

import com.example.hystrixdemo.service.UserInfoService;
import com.example.hystrixdemo.vo.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 卫云鹏
 * @date in 17:43 2019/12/6
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserInfoService userInfoService;
    @GetMapping("/getUserList")
    public List<User> getUserList(){
        List<User> userList = userInfoService.getUserList();
        return userList;
    }

    @GetMapping("/getMemberList")
    @HystrixCommand(fallbackMethod = "fallBackGetMemberList")
    public List<User> getMemberList(){
        List<User> userList = userInfoService.getUserList();
        return userList;
    }

    private List<User> fallBackGetMemberList(){
        log.warn("Hystrix熔断");
        return null;
    }
}
