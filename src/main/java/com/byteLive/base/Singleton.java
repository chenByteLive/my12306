package com.byteLive.base;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.concurrent.ConcurrentHashMap;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Singleton {
    private static final ConcurrentHashMap<String, Object> SINGLE_OBJECT_POOL = new ConcurrentHashMap();

    /**
     * 根据key获取单例对象
     * @param key
     */
    public static <T> T get(String key) {
        Object result = SINGLE_OBJECT_POOL.get(key);
        return result == null ? null : (T) result;
    }

    /**
     * 对象放入容器
     * @param key
     * @param value
     */
    public static  void put(String key, Object value) {
        SINGLE_OBJECT_POOL.put(key, value);
    }
    public static  void put(Object value) {
        SINGLE_OBJECT_POOL.put(value.getClass().getName(), value);
    }
}
