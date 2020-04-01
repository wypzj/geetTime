package com.design.pattern.study.observerpattern.asyncclassic;

import com.design.pattern.study.observerpattern.common.Message;
import com.design.pattern.study.observerpattern.common.Observer;
import com.design.pattern.study.observerpattern.common.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author a small asshole
 * @version 1.0
 * @description 具体异步被观察者实现类--自定义线程
 * @date in 16:23 2020/3/26
 * @since TODO
 */
public class AsyncConcreteSubject implements Subject {
    private List<Observer> observerList = new ArrayList<>();

    private final ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
            10,
            20,
            10000,
            TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<>());
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
            //update方法交给线程池去执行
            poolExecutor.execute(()->{
                System.out.println("线程池工作");
                observer.update();
            });
        }
    }
}
