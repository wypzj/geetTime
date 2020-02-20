package io.netty.action.common;

import lombok.ToString;

/**
 * @author a small asshole
 * @version 1.0
 * @description 消息请求message
 * @date in 18:32 2020/2/18
 * @since 1.0
 */
public class RequestMessage extends Message<Operation> {
    @Override
    public Class getMessageBodyDecodeClass(int opCode) {
        return OperationType.getFromOpCode(opCode).getOperationClass();
    }
    public RequestMessage(){}

    public RequestMessage(Long streamId,Operation operation){
        MessageHeader messageHeader = new MessageHeader();
        messageHeader.setStreamId(streamId);
        messageHeader.setOpCode(OperationType.getFromOperation(operation).getOpCode());

        this.setMessageHeader(messageHeader);
        this.setMessageBody(operation);
    }
}
