package com.design.pattern.study.singleton;

/**
 * @author a small asshole
 * @version 1.0
 * @description 单例模式-饿汉模式 hungry man pattern
 *在类定义的时候就初始化
 * 缺点：不支持延迟加载
 * @date in 16:43 2020/2/20
 * @since 1.0
 */
public class Singleton {
    public static final Singleton INSTANCE = new Singleton();

    private Singleton(){}

    public void doSomething(){
        System.out.println("doSomething...");
    }
}
