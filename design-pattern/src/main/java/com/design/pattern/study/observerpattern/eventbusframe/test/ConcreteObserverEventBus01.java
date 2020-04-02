package com.design.pattern.study.observerpattern.eventbusframe.test;

import com.design.pattern.study.observerpattern.common.Message;
import com.design.pattern.study.observerpattern.common.Observer;
import com.design.pattern.study.observerpattern.eventbusframe.annotations.Subscribe;

/**
 * @author a small asshole
 * @version 1.0
 * @description 观察者1
 * @date in 16:29 2020/3/26
 * @since TODO
 */
public class ConcreteObserverEventBus01 implements Observer {

    @Override
    public void update() {
        System.out.println("小偷开始偷东西了，便衣01动手");
    }

    @Subscribe
    public void execute(Message message){
        System.out.println("EventBus01小偷开始偷东西了，便衣01动手");
    }
}
