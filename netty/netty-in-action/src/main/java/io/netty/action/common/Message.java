package io.netty.action.common;

import io.netty.action.util.JsonUtil;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.nio.charset.Charset;

/**
 * @author a small asshole
 * @version 1.0
 * @description 消息
 * @date in 16:05 2020/2/18
 * @since 1.0
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public abstract class Message<T extends MessageBody> {
    private MessageHeader messageHeader;

    private T messageBody;

    public T getMessageBody() {
        return messageBody;
    }

    public void ecode(ByteBuf byteBuf) {
        byteBuf.writeInt(messageHeader.getVersion());
        byteBuf.writeInt(messageHeader.getOpCode());
        byteBuf.writeLong(messageHeader.getStreamId());
        byteBuf.writeBytes(JsonUtil.toGson(messageBody).getBytes());
    }

    /**
     * 根据opCode获取消息体的解码类类型
     *
     * @param opCode
     * @return
     */
    public abstract Class<T> getMessageBodyDecodeClass(int opCode);

    public void decode(ByteBuf msg) {
        int version = msg.readInt();
        int opCode = msg.readInt();
        long streamId = msg.readLong();

        MessageHeader messageHeader = new MessageHeader();
        messageHeader.setVersion(version);
        messageHeader.setOpCode(opCode);
        messageHeader.setStreamId(streamId);
        this.messageHeader = messageHeader;

        Class<T> messageBodyDecodeClass = getMessageBodyDecodeClass(opCode);
        String jsonStr = msg.toString(Charset.forName("UTF-8"));
        T body = JsonUtil.fromGson(jsonStr, messageBodyDecodeClass);
        this.messageBody = body;
    }


}
