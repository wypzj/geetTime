package io.netty.action.client.codec;

import io.netty.action.common.ResponseMessage;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.util.List;

/**
 * @author a small asshole
 * @version 1.0
 * @description 协议->消息类解码器
 * @date in 14:29 2020/2/19
 * @since 1.0
 */
public class OrderProtcolDecode extends MessageToMessageDecoder<ByteBuf> {
    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.decode(msg);

        out.add(responseMessage);
    }
}
