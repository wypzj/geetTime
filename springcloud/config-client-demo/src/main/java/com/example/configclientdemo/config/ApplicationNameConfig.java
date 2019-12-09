package com.example.configclientdemo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author 卫云鹏
 * @date in 21:04 2019/12/8
 */
@Component
@ConfigurationProperties(prefix = "bull")
@Data
@RefreshScope
public class ApplicationNameConfig {
    private String a;
}
