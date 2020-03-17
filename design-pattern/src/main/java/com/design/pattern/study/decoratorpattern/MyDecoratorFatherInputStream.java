package com.design.pattern.study.decoratorpattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 装饰类父类
 * @date in 11:01 2020/3/10
 * @since 1.0
 */
public class MyDecoratorFatherInputStream extends InputStream {
    protected InputStream inputStream;
    protected MyDecoratorFatherInputStream(InputStream inputStream){
        this.inputStream = inputStream;
    }
    @Override
    public void read() {
        inputStream.read();
    }

    @Override
    public void write() {
        inputStream.write();
    }

    @Override
    public void foo() {
        inputStream.foo();
    }
}
