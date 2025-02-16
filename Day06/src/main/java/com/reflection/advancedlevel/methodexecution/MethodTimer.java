package com.reflection.advancedlevel.methodexecution;

import java.lang.reflect.Method;

public class MethodTimer {

    public static void measureExecutionTime(Object obj) {
        Class<?> clazz = obj.getClass();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Timed.class)) {
                try {
                    long startTime = System.nanoTime();
                    method.invoke(obj);  // Invoke the method dynamically
                    long endTime = System.nanoTime();
                    long duration = (endTime - startTime) / 1_000_000;  // Convert to milliseconds

                    System.out.println("Execution time of " + method.getName() + ": " + duration + " ms");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

