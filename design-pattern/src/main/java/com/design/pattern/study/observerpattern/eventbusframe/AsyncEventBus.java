package com.design.pattern.study.observerpattern.eventbusframe;


import java.util.concurrent.Executor;

/**
 * @author a small asshole
 * @version 1.0
 * @description 异步事件总线
 * @date in 11:30 2020/4/2
 * @since 1.0
 */
public class AsyncEventBus extends EventBus{
public AsyncEventBus(Executor executor){
    super(executor);
}

}
