package com.example.hystrixdemo.service.back;

import com.example.hystrixdemo.service.UserInfoService;
import com.example.hystrixdemo.vo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * @author 卫云鹏
 * @date in 17:46 2019/12/6
 */
@Slf4j
@Component
public class UserInfoServiceFallBack implements UserInfoService {
    @Override
    public List<User> getUserList() {
        log.info("getUserList:{}","熔断");
        return Collections.emptyList();
    }
}
