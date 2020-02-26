package com.design.pattern.study.singleton;

/**
 * @author a small asshole
 * @version 1.0
 * @description 单例测试
 * @date in 13:07 2020/2/21
 * @since 1.0
 */
public class TestSingletonPattern {
    public static void main(String[] args) {
        //饿汉模式
        Singleton.INSTANCE.doSomething();
        //懒汉模式（双重效验）
        Singleton2.getInstance().doSomething();
        //静态内部类
        Singleton3.getInstance().doSomething();
        //枚举
        Singleton4.INSTANCE.doSomething();
    }
}
