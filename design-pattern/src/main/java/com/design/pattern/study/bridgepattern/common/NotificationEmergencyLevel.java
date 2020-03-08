package com.design.pattern.study.bridgepattern.common;

/**
 * @author a small asshole
 * @version 1.0
 * @description 告警级别枚举
 * 根据不同的告警规则，触发不同类型的告警。
 * 告警支持多种通知渠道，包括：邮件、短信、微信、自动语音电话。
 * 通知的紧急程度有多种类型，包括：
 * SEVERE（严重）、URGENCY（紧急）、NORMAL（普通）、TRIVIAL（无关紧要）。
 * 不同的紧急程度对应不同的通知渠道。比如，SERVE（严重）级别的消息会通过“自动语音电话”告知相关人员。
 * @date in 12:05 2020/3/7
 * @since 1.0
 */
public enum NotificationEmergencyLevel {
    SEVERE, URGENCY, NORMAL, TRIVIAL
}
