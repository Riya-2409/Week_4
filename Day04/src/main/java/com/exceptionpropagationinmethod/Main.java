package com.exceptionpropagationinmethod;

public class Main {

    public static void main(String[] args) {
        try {
            ExceptionPropagationExample.method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
