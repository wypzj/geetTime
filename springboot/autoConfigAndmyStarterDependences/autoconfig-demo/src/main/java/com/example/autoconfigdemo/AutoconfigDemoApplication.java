package com.example.autoconfigdemo;

import com.pac.HomeSourceApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AutoconfigDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoconfigDemoApplication.class, args);
    }

    @Bean
    public HomeSourceApplication getHomeSourceApplication(){
        return new HomeSourceApplication("自己配置");
    }

}
