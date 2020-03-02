package com.design.pattern.study.proxypattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 真实user对象
 * @date in 17:25 2020/3/2
 * @since 1.0
 */
public class UserRealImpl implements UserInterface {
    @Override
    public boolean login() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }
}
