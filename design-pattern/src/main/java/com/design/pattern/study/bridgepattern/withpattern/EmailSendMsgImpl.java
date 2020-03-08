package com.design.pattern.study.bridgepattern.withpattern;

import com.design.pattern.study.bridgepattern.withpattern.notificaty.SendMsg;

import java.util.List;

/**
 * @author a small asshole
 * @version 1.0
 * @description 邮件推送
 * @date in 16:40 2020/3/7
 * @since 1.0
 */
public class EmailSendMsgImpl implements SendMsg {
    private List<String> emails;
    public EmailSendMsgImpl(List<String> emails){
        this.emails = emails;
    }
    public void send(String msg) {
        System.out.println("邮件信息推送："+msg);
    }
}
