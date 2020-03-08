package com.design.pattern.study.bridgepattern.withpattern.notificaty;

import com.design.pattern.study.bridgepattern.withpattern.notificaty.SendMsg;

/**
 * @author a small asshole
 * @version 1.0
 * @description 通知抽象类
 * @date in 16:39 2020/3/7
 * @since 1.0
 */
public abstract class Notification {
    protected SendMsg sendMsg;

    protected Notification(SendMsg sendMsg){
        this.sendMsg = sendMsg;
    }

    /**
     * 通知的方法
     * @param msg
     */
    public abstract void notify(String msg);
}
