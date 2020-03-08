package com.design.pattern.study.bridgepattern.nopattern;

import com.design.pattern.study.bridgepattern.common.NotificationEmergencyLevel;

import java.util.List;

/**
 * @author a small asshole
 * @version 1.0
 * @description 信息通知类
 * 根据不同的告警规则，触发不同类型的告警。
 * 告警支持多种通知渠道，包括：邮件、短信、微信、自动语音电话。
 * 通知的紧急程度有多种类型，包括：SEVERE（严重）、URGENCY（紧急）、NORMAL（普通）、TRIVIAL（无关紧要）。
 * 不同的紧急程度对应不同的通知渠道。比如，SERVE（严重）级别的消息会通过“自动语音电话”告知相关人员。
 * @date in 12:07 2020/3/7
 * @since 1.0
 */
public class Notification {
    private List<String> emailAddresses;
    private List<String> telephones;
    private List<String> wechatIds;

    public void notify(NotificationEmergencyLevel level,String message){
        if (NotificationEmergencyLevel.SEVERE.equals(level)){
            //打电话
        }else if(NotificationEmergencyLevel.URGENCY.equals(level)){
            //发邮件
        }else if(NotificationEmergencyLevel.TRIVIAL.equals(level)){
            //发微信
        }else if(NotificationEmergencyLevel.NORMAL.equals(level)){
            //发邮件
        }
    }
}
