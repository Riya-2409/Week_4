package com.annotation.practiceproblem.advanced.cacheresult;

import java.util.HashMap;
import java.util.Map;

class CacheManager {
    private static final Map<String, Object> cache = new HashMap<>();

    public static Object getCachedResult(String key) {
        return cache.get(key);
    }

    public static void putCachedResult(String key, Object value) {
        cache.put(key, value);
    }
}
