package com.example.eurekaclientdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 卫云鹏
 * @date in 14:43 2019/12/3
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/getList")
    public List<String> getList(){
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        strings.add("f");
        return strings;
    }
}
