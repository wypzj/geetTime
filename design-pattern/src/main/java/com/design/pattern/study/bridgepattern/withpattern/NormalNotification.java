package com.design.pattern.study.bridgepattern.withpattern;

import com.design.pattern.study.bridgepattern.withpattern.notificaty.Notification;

/**
 * @author a small asshole
 * @version 1.0
 * @description 普通级别通知
 * @date in 16:44 2020/3/7
 * @since 1.0
 */
public class NormalNotification extends Notification {
    public NormalNotification(EmailSendMsgImpl sendMsg) {
        super(sendMsg);
    }

    @Override
    public void notify(String msg) {
        sendMsg.send(msg);
    }
}
