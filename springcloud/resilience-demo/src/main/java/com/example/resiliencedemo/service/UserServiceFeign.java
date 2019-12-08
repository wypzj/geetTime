package com.example.resiliencedemo.service;

import com.example.resiliencedemo.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author 卫云鹏
 * @date in 15:20 2019/12/8
 */
@FeignClient(value = "zookeeper-client",path = "/user")
public interface UserServiceFeign {
    @GetMapping("/getUserList")
    public List<User> getUserList();

    @GetMapping("/getYoungUserList")
    public List<User> getYoungUserList();
}
