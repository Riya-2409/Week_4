package com.reflection.advancedlevel.dependencyinjection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DIContainer {

    private final Map<Class<?>, Object> instances = new HashMap<>();

    public void register(Class<?> clazz) throws Exception {
        Object instance = createInstance(clazz);
        instances.put(clazz, instance);
    }

    private Object createInstance(Class<?> clazz) throws Exception {
        Object instance = clazz.getDeclaredConstructor().newInstance();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                Class<?> dependencyType = field.getType();
                Object dependency = instances.get(dependencyType);

                if (dependency == null) {
                    dependency = createInstance(dependencyType);
                    instances.put(dependencyType, dependency);
                }

                field.setAccessible(true);
                field.set(instance, dependency);
            }
        }
        return instance;
    }

    public <T> T getInstance(Class<T> clazz) {
        return clazz.cast(instances.get(clazz));
    }
}
