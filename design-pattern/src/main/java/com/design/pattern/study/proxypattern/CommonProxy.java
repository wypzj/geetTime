package com.design.pattern.study.proxypattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 非动态代理模式
 * @date in 18:04 2020/3/2
 * @since 1.0
 */
public class CommonProxy implements UserInterface {
    private UserRealImpl userReal;

    public CommonProxy(UserRealImpl realUserObject){
        this.userReal = realUserObject;
    }

    @Override
    public boolean login() {
        long beginTime = System.currentTimeMillis();
        boolean login = userReal.login();
        long endTime = System.currentTimeMillis();
        System.out.println("方法执行时间"+(endTime-beginTime));
        return false;
    }
}
