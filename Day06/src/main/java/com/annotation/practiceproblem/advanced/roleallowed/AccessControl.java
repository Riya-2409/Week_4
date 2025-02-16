package com.annotation.practiceproblem.advanced.roleallowed;

import java.lang.reflect.Method;

public class AccessControl {

    private String currentUserRole;

    public AccessControl(String role) {
        this.currentUserRole = role;
    }

    public void executeMethod(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                if (!roleAllowed.value().equals(currentUserRole)) {
                    System.out.println("Access Denied!");
                    return;
                }
            }
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

