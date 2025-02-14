package com.exceptionpropagationinmethod;

public class ExceptionPropagationExample {

    // Method that causes an ArithmeticException
    public static void method1() {
        int result = 10 / 0; // This will cause ArithmeticException
    }

    // Method that calls method1()
    public static void method2() {
        method1();
    }
}
