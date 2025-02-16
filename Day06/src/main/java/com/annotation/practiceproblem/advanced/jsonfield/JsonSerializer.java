package com.annotation.practiceproblem.advanced.jsonfield;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Field;

public class JsonSerializer {

    public static String serialize(Object obj) {
        Map<String, String> jsonElements = new HashMap<>();
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                try {
                    JsonField annotation = field.getAnnotation(JsonField.class);
                    jsonElements.put(annotation.name(), field.get(obj).toString());
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Error accessing field", e);
                }
            }
        }
        return jsonElements.toString().replace("=", ": ");
    }
}
