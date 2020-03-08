package com.design.pattern.study.bridgepattern.withpattern;

import com.design.pattern.study.bridgepattern.withpattern.notificaty.SendMsg;

import java.util.List;

/**
 * @author a small asshole
 * @version 1.0
 * @description 微信推送
 * @date in 16:40 2020/3/7
 * @since 1.0
 */
public class WechatSendMsgImpl implements SendMsg {
    private List<String> wechatIds;
    public WechatSendMsgImpl(List<String> wechatIds){
        this.wechatIds = wechatIds;
    }
    public void send(String msg) {
        System.out.println("微信信息推送："+msg);
    }
}
