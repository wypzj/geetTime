package com.example.myautoconfig.config;

import com.pac.HomeSourceApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 卫云鹏
 * @date in 20:11 2019/11/29
 */
@Configuration
@ConditionalOnClass(HomeSourceApplication.class)
public class HomeSourceConfig {
    @Bean
    @ConditionalOnMissingBean(HomeSourceApplication.class)
    @ConditionalOnProperty(name = "my.autoconfig.enable",havingValue = "true",matchIfMissing = false)
    public HomeSourceApplication getHomeSourceApplication(){
        return new HomeSourceApplication("配置类自动注入");
    }
}
