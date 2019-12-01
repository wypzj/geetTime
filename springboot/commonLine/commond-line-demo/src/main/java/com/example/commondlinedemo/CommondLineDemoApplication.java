package com.example.commondlinedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CommondLineDemoApplication {

    public static void main(String[] args) {
        //方式1：程序控制：应用启动时不启动web容器
//        new SpringApplicationBuilder(CommondLineDemoApplication.class)
//                .web(WebApplicationType.NONE)
//                .run(args);
        //方式2：配置文件配置，自动读取配置文件控制
        SpringApplication.run(CommondLineDemoApplication.class, args);
    }

}
