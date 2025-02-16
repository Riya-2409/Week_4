package com.annotation.practiceproblem.intermediate.maxlength;

import java.lang.reflect.Field;

public class MaxLengthValidator {
    public static void validate(Object obj) {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                field.setAccessible(true);
                try {
                    String value = (String) field.get(obj);
                    if (value != null && value.length() > maxLength.value()) {
                        throw new IllegalArgumentException(field.getName() + " exceeds maximum length of " + maxLength.value() + " characters");
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Field validation error", e);
                }
            }
        }
    }
}

