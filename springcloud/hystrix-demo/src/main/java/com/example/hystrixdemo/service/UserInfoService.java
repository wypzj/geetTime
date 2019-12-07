package com.example.hystrixdemo.service;

import com.example.hystrixdemo.service.back.UserInfoServiceFallBack;
import com.example.hystrixdemo.vo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 远程服务调用接口
 * @author 卫云鹏
 * @date in 13:43 2019/12/6
 */
@FeignClient(name = "zookeeper-client",path = "/user",fallback = UserInfoServiceFallBack.class)
public interface UserInfoService {
    @GetMapping("/getUserList")
    List<User> getUserList();
}
