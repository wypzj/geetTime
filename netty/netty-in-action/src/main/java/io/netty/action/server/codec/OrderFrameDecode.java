package io.netty.action.server.codec;

import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

/**
 * @author a small asshole
 * @version 1.0
 * @description 服务端沾包半包解码器
 * @date in 21:31 2020/2/18
 * @since 1.0
 */
public class OrderFrameDecode extends LengthFieldBasedFrameDecoder {
    public OrderFrameDecode() {
        super(Integer.MAX_VALUE, 0, 2,0, 2);
    }
}
