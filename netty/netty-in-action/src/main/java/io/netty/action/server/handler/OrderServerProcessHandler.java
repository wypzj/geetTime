package io.netty.action.server.handler;

import io.netty.action.common.Operation;
import io.netty.action.common.OperationResult;
import io.netty.action.common.RequestMessage;
import io.netty.action.common.ResponseMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author a small asshole
 * @version 1.0
 * @description order服务处理类
 * @date in 14:43 2020/2/19
 * @since 1.0
 */
public class OrderServerProcessHandler extends SimpleChannelInboundHandler<RequestMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, RequestMessage msg) throws Exception {
        Operation operation = msg.getMessageBody();
        OperationResult result = operation.execute();
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setMessageHeader(msg.getMessageHeader());
        responseMessage.setMessageBody(result);

        ctx.writeAndFlush(responseMessage);
    }
}
