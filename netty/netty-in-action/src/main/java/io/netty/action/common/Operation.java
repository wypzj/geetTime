package io.netty.action.common;

/**
 * @author a small asshole
 * @version 1.0
 * @description 操作抽象类
 * @date in 16:04 2020/2/18
 * @since 1.0
 */
public abstract class Operation extends MessageBody {

    public abstract OperationResult execute();

}
