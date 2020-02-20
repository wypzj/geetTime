package io.netty.action.common;

import com.google.common.base.Predicate;
import io.netty.action.common.auth.AuthOperation;
import io.netty.action.common.auth.AuthOperationResult;

/**
 * @author a small asshole
 * @version 1.0
 * @description 操作类型枚举类
 * @date in 17:00 2020/2/18
 * @since 1.0
 */
public enum OperationType {
    AUTH(1, AuthOperation.class, AuthOperationResult.class);

    private int opCode;

    private Class<? extends Operation> operationClass;

    private Class<? extends OperationResult> operationResultClass;

    OperationType(int opCode, Class<? extends Operation> operationClass, Class<? extends OperationResult> operationResultClass) {
        this.opCode = opCode;
        this.operationClass = operationClass;
        this.operationResultClass = operationResultClass;
    }

    public int getOpCode() {
        return this.opCode;
    }

    public Class<? extends Operation> getOperationClass() {
        return this.operationClass;
    }

    public Class<? extends OperationResult> getOperationResultClass() {
        return this.operationResultClass;
    }

    /**
     * 根据opCode获取对应的OperationType实例
     *
     * @param opCode
     * @return
     */
    public static OperationType getFromOpCode(int opCode) {
        return getOperationType(input -> {
            assert input != null;
            return input.opCode == opCode;
        });
    }

    public static OperationType getFromOperation(Operation operation) {
        return getOperationType(input -> {
            assert input != null;
            return input.operationClass == operation.getClass();
        });
    }

    private static OperationType getOperationType(Predicate<OperationType> predicate) {
        OperationType[] values = values();
        for (OperationType operationType : values) {
            if (predicate.apply(operationType)) {
                return operationType;
            }
        }
        throw new AssertionError("not found type");
    }
}
