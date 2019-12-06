package com.example.circuitprotectdemo.controller;

import com.example.circuitprotectdemo.service.UserInfoService;
import com.example.circuitprotectdemo.vo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 卫云鹏
 * @date in 21:02 2019/12/5
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
        log.info("{}",userList);
        return userList;
    }
}
