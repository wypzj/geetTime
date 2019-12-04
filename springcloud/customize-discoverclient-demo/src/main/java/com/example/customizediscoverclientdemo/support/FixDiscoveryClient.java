package com.example.customizediscoverclientdemo.support;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 卫云鹏
 * @date in 17:35 2019/12/4
 */
@ConfigurationProperties("waiter")
@Setter
@Slf4j
public class FixDiscoveryClient implements DiscoveryClient {
    public static final String SERVICE_ID="eureka-client";

    private List<String> servers;

    @Override
    public String description() {
        log.info("自定义discoveryclient");
        return "自定义discoveryclient";
    }

    @Override
    public List<ServiceInstance> getInstances(String serviceId) {
        description();
        //只有一个服务实例，写死，如果不是我这里配置得实例，我就返回一个空集合
        if(!SERVICE_ID.equalsIgnoreCase(serviceId)){
            return Collections.emptyList();
        }
        List<ServiceInstance> collect = servers.stream().map(server -> new DefaultServiceInstance(
                server,
                serviceId,
                server.split(":")[0],
                Integer.valueOf(server.split(":")[1]),
                false)).collect(Collectors.toList());
        return collect;
    }

    @Override
    public List<String> getServices() {
        return Collections.singletonList(SERVICE_ID);
    }
}
