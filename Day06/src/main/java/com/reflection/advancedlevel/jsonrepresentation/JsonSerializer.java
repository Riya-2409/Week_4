package com.reflection.advancedlevel.jsonrepresentation;

import java.lang.reflect.Field;

public class JsonSerializer {

    public static String toJson(Object obj) {
        if (obj == null) {
            return "null";
        }

        StringBuilder json = new StringBuilder("{");
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true); // Allow access to private fields
            try {
                json.append("\"").append(fields[i].getName()).append("\": ");

                Object value = fields[i].get(obj);

                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }
            } catch (IllegalAccessException e) {
                json.append("\"error\"");
            }

            if (i < fields.length - 1) {
                json.append(", ");
            }
        }

        json.append("}");
        return json.toString();
    }
}

