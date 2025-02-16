package com.reflection.basiclevel.classinspector;

import java.lang.reflect.Constructor;
import java.util.*;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class ClassInspector {

    public static void inspectClass(String className) {
        try {

            Class<?> clazz = Class.forName(className);


            System.out.println("\nClass Name: " + clazz.getName());


            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(" " + constructor);
            }
            System.out.println("\nFields:");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(" " + field);
            }
            System.out.println("\nMethods:");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(" " + method);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found. Please enter a valid class name.");
        }
    }
}
