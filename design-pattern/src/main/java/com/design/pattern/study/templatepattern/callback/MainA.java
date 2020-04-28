package com.design.pattern.study.templatepattern.callback;

/**
 * @author a small asshole
 * @version 1.0
 * @description 主线程执行类A
 * @date in 11:58 2020/4/28
 * @since 1.0
 */
public class MainA {
    private MyCallBackInter listener;


    public MyCallBackInter getListener() {
        return listener;
    }

    public void setListener(ListenerManager manager, MyCallBackInter listener) {
        this.listener = listener;
        manager.registe(listener);
    }
}
