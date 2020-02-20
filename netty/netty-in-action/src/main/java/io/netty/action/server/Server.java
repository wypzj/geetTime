package io.netty.action.server;

import io.netty.action.server.codec.OrderFrameDecode;
import io.netty.action.server.codec.OrderFrameEncode;
import io.netty.action.server.codec.OrderProtcolDecode;
import io.netty.action.server.codec.OrderProtcolEncode;
import io.netty.action.server.handler.OrderServerProcessHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

import java.util.concurrent.ExecutionException;

/**
 * @author a small asshole
 * @version 1.0
 * @description 服务端启动类
 * @date in 14:50 2020/2/19
 * @since 1.0
 */
public class Server {
    public static void main(String[] args) {
        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.channel(NioServerSocketChannel.class);
        bootstrap.handler(new LoggingHandler(LogLevel.INFO));
        bootstrap.group(new NioEventLoopGroup());

        bootstrap.childHandler(new ChannelInitializer<NioSocketChannel>() {
            @Override
            protected void initChannel(NioSocketChannel ch) throws Exception {
                ChannelPipeline pipeline = ch.pipeline();
                pipeline.addLast(new OrderFrameDecode());
                pipeline.addLast(new OrderFrameEncode());

                pipeline.addLast(new OrderProtcolEncode());
                pipeline.addLast(new OrderProtcolDecode());

                pipeline.addLast(new LoggingHandler(LogLevel.INFO));
                pipeline.addLast(new OrderServerProcessHandler());
            }
        });

        try {
            ChannelFuture channelFuture = bootstrap.bind(8089).sync();
            channelFuture.channel().closeFuture().get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
