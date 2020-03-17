package com.design.pattern.study.decoratorpattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description
 * @date in 10:37 2020/3/10
 * @since TODO
 */
public abstract class InputStream {
    public void read(){
        System.out.println("inputStream 默认实现");
    }

    public void write(){
        System.out.println("inputStream 默认实现");
    }

    public void foo(){
        System.out.println("inputStream 默认实现");
    }
}
