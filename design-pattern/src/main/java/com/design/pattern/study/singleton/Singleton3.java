package com.design.pattern.study.singleton;

/**
 * @author a small asshole
 * @version 1.0
 * @description 单例模式-静态内部类
 * 这种方式有点儿类似饿汉模式，但是它又能做到延迟加载（静态内部类的特性）
 * @date in 11:57 2020/2/21
 * @since 1.0
 */
public class Singleton3 {
    private Singleton3() {}

    private static class SingletonHolder{
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void doSomething() {
        System.out.println("doSomething...");
    }
}
