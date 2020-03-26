package com.design.pattern.study.observerpattern;

import com.design.pattern.study.observerpattern.classic.*;

/**
 * @author a small asshole
 * @version 1.0
 * @description 观察者测试代码
 * @date in 16:34 2020/3/26
 * @since TODO
 */
public class ObserverTestCode {
    public static void main(String[] args) {
        Message message = new Message();
        message.setMessageStr("小偷：我要开始动手了");
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver01();
        Observer observer2 = new ConcreteObserver02();
        subject.registObserver(observer1);
        subject.registObserver(observer2);
        subject.action(message);
    }
}
