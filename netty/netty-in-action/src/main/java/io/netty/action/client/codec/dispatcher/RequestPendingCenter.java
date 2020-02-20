package io.netty.action.client.codec.dispatcher;

import io.netty.action.common.OperationResult;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author a small asshole
 * @version 1.0
 * @description 请求响应等待中心
 * @date in 19:22 2020/2/19
 * @since 1.0
 */
public class RequestPendingCenter {
    private Map<Long, OperationResultFuture> map = new ConcurrentHashMap<>();

    public void add(long streamId, OperationResultFuture operationResultFuture) {
        this.map.put(streamId, operationResultFuture);
    }

    public void set(long streamId, OperationResult operationResult) {
        OperationResultFuture operationResultFuture = this.map.get(streamId);
        if (operationResultFuture != null) {
            operationResultFuture.setSuccess(operationResult);
            this.map.remove(streamId);
        }
    }
}
