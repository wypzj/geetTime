package com.design.pattern.study.singleton;

/**
 * @author a small asshole
 * @version 1.0
 * @description 单例模式-懒汉模式(双重效验) lazy man pattern
 * 普通的懒汉模式我就不写了，存在并发性能问题，基本就是串行化的了
 * <p>
 * 在调用的时候初始化
 * @date in 16:43 2020/2/20
 * @since 1.0
 */
public class Singleton2 {
    private static Singleton2 singleton2;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            synchronized (Singleton2.class) {
                if (singleton2 == null) {
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }

    public void doSomething() {
        System.out.println("doSomething...");
    }
}
