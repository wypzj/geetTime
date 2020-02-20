package io.netty.action.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author a small asshole
 * @version 1.0
 * @description 消息头
 * @date in 16:05 2020/2/18
 * @since 1.0
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class MessageHeader {
    /**
     * 协议版本
     */
    private int version = 1;
    /**
     * 消息（操作）的类型
     */
    private int opCode;
    /**
     * 标识当前消息的唯一标识
     */
    private long streamId;
}
