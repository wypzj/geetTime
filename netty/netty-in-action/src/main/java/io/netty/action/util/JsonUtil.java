package io.netty.action.util;

import com.google.gson.Gson;

/**
 * @author a small asshole
 * @version 1.0
 * @description Gson序列化和反反序列化工具类
 * @date in 16:18 2020/2/18
 * @since 1.0
 */
public final class JsonUtil {
    private static final Gson GSON = new Gson();

    private JsonUtil() {
    }

    ;

    /**
     * 反序列化
     *
     * @param jsonStr
     * @param typeOfT
     * @param <T>
     * @return
     */
    public static <T> T fromGson(String jsonStr, Class<T> typeOfT) {
        return GSON.fromJson(jsonStr, typeOfT);
    }

    /**
     * 序列化
     *
     * @param object
     * @return
     */
    public static String toGson(Object object) {
        return GSON.toJson(object);
    }

}
