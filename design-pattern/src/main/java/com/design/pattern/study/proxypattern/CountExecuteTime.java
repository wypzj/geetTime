package com.design.pattern.study.proxypattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 统计方法执行时间
 * @date in 17:21 2020/3/2
 * @since 1.0
 */
public class CountExecuteTime {
    public static void main(String[] args) {
        UserRealImpl userReal = new UserRealImpl();
        CommonProxy commonProxy = new CommonProxy(userReal);
        commonProxy.login();
    }
}
