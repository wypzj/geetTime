package com.design.pattern.study.decoratorpattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description
 * @date in 10:37 2020/3/10
 * @since 1.0
 */
public class MyInputStream extends InputStream {
    @Override
    public void read(){
        System.out.println("MyInputStream 默认实现");
    }

    @Override
    public void write(){
        System.out.println("MyInputStream 默认实现");
    }

    @Override
    public void foo(){
        System.out.println("MyInputStream 默认实现");
    }
}
