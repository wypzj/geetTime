package com.design.pattern.study.singletonpattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 单例模式-枚举类
 * 利用枚举类的特性保证创建对象的唯一性和线程安全性
 * @date in 13:04 2020/2/21
 * @since 1.0
 */
public enum Singleton4 {
    INSTANCE;

    private Singleton4(){}

    public void doSomething(){
        System.out.println("doing something...");
    }
}
