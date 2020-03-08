package com.design.pattern.study.bridgepattern;

import com.design.pattern.study.bridgepattern.common.NotificationEmergencyLevel;
import com.design.pattern.study.bridgepattern.nopattern.Notification;
import com.design.pattern.study.bridgepattern.withpattern.EmailSendMsgImpl;
import com.design.pattern.study.bridgepattern.withpattern.NormalNotification;

import java.util.ArrayList;
import java.util.List;

/**
 * @author a small asshole
 * @version 1.0
 * @description 告警通知代码
 * @date in 12:01 2020/3/7
 * @since 1.0
 */
public class TestCode {
    public static void main(String[] args) {
        /**
         * 不使用桥接模式
         */
        //系统检查到错误了，所以给用户发通知
        Notification notification = new Notification();
        //SEVERE--严重错误级别
        notification.notify(NotificationEmergencyLevel.SEVERE,"系统出现严重问题，请检查");
        //URGENCY--紧急
        notification.notify(NotificationEmergencyLevel.URGENCY,"系统出现紧急问题，请检查");
        //NORMAL--普通
        notification.notify(NotificationEmergencyLevel.NORMAL,"系统出现普通问题，请检查");
        //TRIVIAL--无关紧要
        notification.notify(NotificationEmergencyLevel.TRIVIAL,"日常提示信息");
        /**
         * 使用桥接模式
         */
        List<String> emails = new ArrayList<String>();
        emails.add("123456789@163.com");
        com.design.pattern.study.bridgepattern.withpattern.notificaty.Notification notification2 = new NormalNotification(new EmailSendMsgImpl(emails));
        notification2.notify("系统出现普通问题，请检查");
    }
}
