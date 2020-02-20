package io.netty.action.common;

import lombok.ToString;

/**
 * @author a small asshole
 * @version 1.0
 * @description
 * @date in 18:42 2020/2/18
 * @since 1.0
 */
public class ResponseMessage extends Message<OperationResult> {
    @Override
    public Class getMessageBodyDecodeClass(int opCode) {
        return OperationType.getFromOpCode(opCode).getOperationResultClass();
    }
}
