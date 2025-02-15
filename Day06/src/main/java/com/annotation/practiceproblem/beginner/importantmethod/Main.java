package com.annotation.practiceproblem.beginner.importantmethod;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Method[] methods = TaskService.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + " | Importance Level: " + annotation.level());
            }
        }

        // Execute important methods
        TaskService taskService = new TaskService();
        taskService.processCriticalTask();
        taskService.processRegularTask();
    }
}
