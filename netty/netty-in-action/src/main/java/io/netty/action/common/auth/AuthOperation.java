package io.netty.action.common.auth;

import io.netty.action.common.Operation;
import io.netty.action.common.OperationResult;
import lombok.*;

/**
 * @author a small asshole
 * @version 1.0
 * @description 认证操作类
 * @date in 17:18 2020/2/18
 * @since 1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthOperation extends Operation {
    private String userName;

    private String password;

    @Override
    public OperationResult execute() {
        if ("admin".equals(this.userName)) {
            return new AuthOperationResult(true);
        }
        return new AuthOperationResult(false);
    }
}
