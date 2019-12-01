package com.example.commondlinedemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

/**
 * @author 卫云鹏
 * @date in 20:28 2019/12/1
 */
@Slf4j
@Component
public class MyExitCodeGenerator implements ExitCodeGenerator {

    @Override
    public int getExitCode() {
        log.info("拉取返回码");
        return 1;
    }
}
