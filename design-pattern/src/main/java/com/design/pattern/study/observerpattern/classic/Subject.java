package com.design.pattern.study.observerpattern.classic;

/**
 * @author a small asshole
 * @version 1.0
 * @description 被观察者
 * @date in 16:18 2020/3/26
 * @since TODO
 */
public interface Subject {
    void registObserver(Observer observer);
    void removeObserver(Observer observer);
    void action(Message message);
}
