package com.design.pattern.study.proxypattern;

import com.design.pattern.study.proxypattern.dynamicproxy.DynamicProxyHandler;

import java.lang.reflect.Proxy;

/**
 * @author a small asshole
 * @version 1.0
 * @description 统计方法执行时间
 * @date in 17:21 2020/3/2
 * @since 1.0
 */
public class CountExecuteTime {
    public static void main(String[] args) {
        //非动态代理
        UserInterface userReal = new UserRealImpl();
//        CommonProxy commonProxy = new CommonProxy(userReal);
//        commonProxy.login();
        //动态代理
        UserInterface userProxyObject = (UserInterface)Proxy.newProxyInstance(userReal.getClass().getClassLoader()
                , userReal.getClass().getInterfaces()
                , new DynamicProxyHandler(userReal));
        userProxyObject.login();
    }
}
