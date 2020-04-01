package com.design.pattern.study.observerpattern.classic;

import com.design.pattern.study.observerpattern.common.Observer;

/**
 * @author a small asshole
 * @version 1.0
 * @description 观察者2
 * @date in 16:29 2020/3/26
 * @since TODO
 */
public class ConcreteObserver02 implements Observer {
    @Override
    public void update() {
        System.out.println("小偷开始偷东西了，便衣02动手");
    }
}
