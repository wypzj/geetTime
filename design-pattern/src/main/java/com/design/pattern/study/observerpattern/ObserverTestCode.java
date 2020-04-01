package com.design.pattern.study.observerpattern;

import com.design.pattern.study.observerpattern.asyncclassic.AsyncConcreteObserver01;
import com.design.pattern.study.observerpattern.asyncclassic.AsyncConcreteObserver02;
import com.design.pattern.study.observerpattern.asyncclassic.AsyncConcreteSubject;
import com.design.pattern.study.observerpattern.classic.*;
import com.design.pattern.study.observerpattern.common.Message;
import com.design.pattern.study.observerpattern.common.Observer;
import com.design.pattern.study.observerpattern.common.Subject;

/**
 * @author a small asshole
 * @version 1.0
 * @description 观察者测试代码
 * @date in 16:34 2020/3/26
 * @since TODO
 */
public class ObserverTestCode {
    public static void main(String[] args) {
        //同步模式
        System.out.println("同步模式");
        Message message = new Message();
        message.setMessageStr("小偷：我要开始动手了");
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver01();
        Observer observer2 = new ConcreteObserver02();
        subject.registObserver(observer1);
        subject.registObserver(observer2);
        subject.action(message);
        //异步观察者模式--线程池
        System.out.println("异步观察者模式--线程池");
        Subject asyncSubject = new AsyncConcreteSubject();
        Observer asyncObserver1 = new AsyncConcreteObserver01();
        Observer asyncObserver2 = new AsyncConcreteObserver02();
        asyncSubject.registObserver(asyncObserver1);
        asyncSubject.registObserver(asyncObserver2);
        asyncSubject.action(message);
    }
}
