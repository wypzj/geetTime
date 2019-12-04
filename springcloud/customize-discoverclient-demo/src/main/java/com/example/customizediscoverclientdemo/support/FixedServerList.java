package com.example.customizediscoverclientdemo.support;

import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 卫云鹏
 * @date in 18:56 2019/12/4
 */
public class FixedServerList implements ServerList<Server> {
    @Autowired
    private FixDiscoveryClient client;
    @Override
    public List<Server> getInitialListOfServers() {
        return getServer();
    }

    @Override
    public List<Server> getUpdatedListOfServers() {
        return getServer();
    }
    private List<Server> getServer(){
        return client.getInstances(FixDiscoveryClient.SERVICE_ID).stream().map(serviceInstance ->
                new Server(serviceInstance.getHost(),serviceInstance.getPort())).collect(Collectors.toList());
    }
}
