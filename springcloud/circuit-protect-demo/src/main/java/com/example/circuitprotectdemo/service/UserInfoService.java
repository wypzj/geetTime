package com.example.circuitprotectdemo.service;

import com.example.circuitprotectdemo.vo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 远程服务调用接口
 * @author 卫云鹏
 * @date in 13:43 2019/12/6
 */
@FeignClient(name = "zookeeper-client",path = "/user")
public interface UserInfoService {
    @GetMapping("/getUserList")
    List<User> getUserList();
}
