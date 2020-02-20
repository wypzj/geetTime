package io.netty.action.client.codec;

import io.netty.action.common.RequestMessage;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

/**
 * @author a small asshole
 * @version 1.0
 * @description 协议->消息类编码器
 * @date in 14:29 2020/2/19
 * @since 1.0
 */
public class OrderProtcolEncode extends MessageToMessageEncoder<RequestMessage> {

    @Override
    protected void encode(ChannelHandlerContext ctx, RequestMessage msg, List<Object> out) throws Exception {
        ByteBuf buffer = ctx.alloc().buffer();
        msg.ecode(buffer);

        out.add(buffer);
    }
}
