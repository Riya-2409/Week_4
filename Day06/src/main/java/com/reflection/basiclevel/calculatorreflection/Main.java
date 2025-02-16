package com.reflection.basiclevel.calculatorreflection;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();
            Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            method.setAccessible(true);
            int result = (int) method.invoke(calculator, 5, 3);
            System.out.println("Multiplication result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
