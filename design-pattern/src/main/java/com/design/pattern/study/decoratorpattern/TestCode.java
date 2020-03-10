package com.design.pattern.study.decoratorpattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description TODO
 * @date in 10:46 2020/3/10
 * @since TODO
 */
public class TestCode {
    public static void main(String[] args) {
        MyInputStream myInputStream = new MyInputStream();
        MyDecoratorInputStream myDecoratorInputStream = new MyDecoratorInputStream(myInputStream);
        myDecoratorInputStream.read();
        myDecoratorInputStream.write();
        myDecoratorInputStream.foo();
    }
}
