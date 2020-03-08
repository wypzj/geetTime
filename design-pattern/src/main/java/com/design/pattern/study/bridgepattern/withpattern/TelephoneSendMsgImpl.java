package com.design.pattern.study.bridgepattern.withpattern;

import com.design.pattern.study.bridgepattern.withpattern.notificaty.SendMsg;

import java.util.List;

/**
 * @author a small asshole
 * @version 1.0
 * @description 电话推送
 * @date in 16:40 2020/3/7
 * @since 1.0
 */
public class TelephoneSendMsgImpl implements SendMsg {
    private List<String> telephones;
    public TelephoneSendMsgImpl(List<String> telephones){
        this.telephones = telephones;
    }
    public void send(String msg) {
        System.out.println("电话信息推送："+msg);
    }
}
