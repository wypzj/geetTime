package com.design.pattern.study.decoratorpattern;

/**
 * @author a small asshole
 * @version 1.0
 * @description 装饰增强类
 * @date in 10:40 2020/3/10
 * @since 1.0
 */
public class MyDecoratorInputStream extends MyDecoratorFatherInputStream{
    public MyDecoratorInputStream(InputStream inputStream){
        super(inputStream);
    }

    @Override
    public void read(){
        //增强
        System.out.println("MyDecoratorInputStream read");
        //原始调用
        inputStream.read();
    }

    @Override
    public void write(){
        inputStream.write();
    }

    //foo方法我不重写
}
