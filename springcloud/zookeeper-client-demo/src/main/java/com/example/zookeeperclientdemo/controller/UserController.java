package com.example.zookeeperclientdemo.controller;

import com.example.zookeeperclientdemo.vo.User;
import lombok.extern.slf4j.Slf4j;
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
    @GetMapping("/getUserList")
    public List<User> getUserList(){
        log.info("调用链进入UserController,method:/getUserList");
        return new ArrayList<User>(){{
            add(new User(1L,"赵云"));
            add(new User(2L,"张飞"));
            add(new User(3L,"刘备"));
            add(new User(4L,"关羽"));
        }};
    }

    @GetMapping("/getYoungUserList")
    public List<User> getYoungUserList(){
        return new ArrayList<User>(){{
            add(new User(1L,"小赵云"));
            add(new User(2L,"小张飞"));
            add(new User(3L,"小刘备"));
            add(new User(4L,"小关羽"));
        }};
    }
}
