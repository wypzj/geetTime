package io.netty.action.util;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author a small asshole
 * @version 1.0
 * @description ID生成工具类
 * @date in 16:29 2020/2/18
 * @since 1.0
 */
public final class IdUtil {
    private static final AtomicLong IDX = new AtomicLong();

    public static long nextId(){
        return IDX.incrementAndGet();
    }
}
