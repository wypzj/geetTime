package com.design.pattern.study.observerpattern.asyncclassic;

import com.design.pattern.study.observerpattern.common.Observer;

/**
 * @author a small asshole
 * @version 1.0
 * @description 异步观察者1
 * @date in 16:29 2020/3/26
 * @since TODO
 */
public class AsyncConcreteObserver01 implements Observer {
    @Override
    public void update() {
        System.out.println("小偷开始偷东西了，异步便衣01动手");
    }
}
