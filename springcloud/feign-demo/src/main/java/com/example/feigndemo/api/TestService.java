package com.example.feigndemo.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 卫云鹏
 * @date in 15:57 2019/12/3
 */
@FeignClient(name = "eureka-client",path = "/test")
public interface TestService {
    @GetMapping("/getList")
    List<String> getList();
}
