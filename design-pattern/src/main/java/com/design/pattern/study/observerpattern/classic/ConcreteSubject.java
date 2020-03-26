package com.design.pattern.study.observerpattern.classic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author a small asshole
 * @version 1.0
 * @description TODO
 * @date in 16:23 2020/3/26
 * @since TODO
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observerList = new ArrayList<>();
    @Override
    public void registObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void action(Message message) {
        System.out.println(message.getMessageStr());
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
