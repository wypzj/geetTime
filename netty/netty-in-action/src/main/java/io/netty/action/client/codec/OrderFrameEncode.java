package io.netty.action.client.codec;

import io.netty.handler.codec.LengthFieldPrepender;

/**
 * @author a small asshole
 * @version 1.0
 * @description 客户端沾包半包编码器
 * @date in 21:31 2020/2/18
 * @since 1.0
 */
public class OrderFrameEncode extends LengthFieldPrepender {

    public OrderFrameEncode() {
        super(2);
    }
}
