package io.netty.action.client;

import io.netty.action.client.codec.OrderFrameDecode;
import io.netty.action.client.codec.OrderFrameEncode;
import io.netty.action.client.codec.OrderProtcolDecode;
import io.netty.action.client.codec.OrderProtcolEncode;
import io.netty.action.client.codec.dispatcher.OperationResultFuture;
import io.netty.action.client.codec.dispatcher.RequestPendingCenter;
import io.netty.action.client.codec.dispatcher.ResponseDispatcherHandler;
import io.netty.action.common.OperationResult;
import io.netty.action.common.RequestMessage;
import io.netty.action.common.auth.AuthOperation;
import io.netty.action.util.IdUtil;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

import java.util.concurrent.ExecutionException;

/**
 * @author a small asshole
 * @version 1.0
 * @description 客户端启动类
 * @date in 15:17 2020/2/19
 * @since 1.0
 */
public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Bootstrap bootstrap = new Bootstrap();
        RequestPendingCenter requestPendingCenter = new RequestPendingCenter();
        bootstrap.channel(NioSocketChannel.class);

        bootstrap.group(new NioEventLoopGroup());

        bootstrap.handler(new ChannelInitializer<NioSocketChannel>() {
            @Override
            protected void initChannel(NioSocketChannel ch) throws Exception {
                ChannelPipeline pipeline = ch.pipeline();
                pipeline.addLast(new OrderFrameDecode());
                pipeline.addLast(new OrderFrameEncode());
                pipeline.addLast(new OrderProtcolEncode());
                pipeline.addLast(new OrderProtcolDecode());
                pipeline.addLast(new LoggingHandler(LogLevel.INFO));
                pipeline.addLast(new ResponseDispatcherHandler(requestPendingCenter));
            }
        });

        ChannelFuture channelFuture = bootstrap.connect("127.0.0.1", 8089);
        channelFuture.sync();
        long streamId = IdUtil.nextId();
        RequestMessage requestMessage =
                new RequestMessage(streamId, new AuthOperation("admin", "1234"));

        OperationResultFuture operationResultFuture = new OperationResultFuture();
        requestPendingCenter.add(streamId, operationResultFuture);

        channelFuture.channel().writeAndFlush(requestMessage);

        OperationResult result = operationResultFuture.get();
        System.out.println(result);

        channelFuture.channel().closeFuture().sync();
    }
}
