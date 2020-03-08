package com.design.pattern.study.bridgepattern.withpattern;

import com.design.pattern.study.bridgepattern.withpattern.notificaty.Notification;
import com.design.pattern.study.bridgepattern.withpattern.notificaty.SendMsg;

/**
 * @author a small asshole
 * @version 1.0
 * @description 紧急级别通知
 * @date in 16:44 2020/3/7
 * @since 1.0
 */
public class UrgencyNotification extends Notification {
    public UrgencyNotification(SendMsg sendMsg) {
        super(sendMsg);
    }

    @Override
    public void notify(String msg) {
        sendMsg.send(msg);
    }
}
