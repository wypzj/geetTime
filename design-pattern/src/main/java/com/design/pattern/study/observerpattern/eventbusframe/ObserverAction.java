package com.design.pattern.study.observerpattern.eventbusframe;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author a small asshole
 * @version 1.0
 * @description Observer注册表中元素对象
 * @date in 17:34 2020/4/1
 * @since 1.0
 */
public class ObserverAction {
    /**
     * 观察者对象
     */
    private Object target;
    /**
     * 观察者对象能接受消息的方法
     */
    private Method method;

    public ObserverAction(Object target, Method method) {
        assert target != null;
        this.target = target;
        this.method = method;
        this.method.setAccessible(true);
    }

    /**
     * 执行
     * @param event 类属性Method的方法参数
     */
    public void execute(Object event){
        try {
            method.invoke(target,event);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
