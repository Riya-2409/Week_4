package com.junit.basic.testingcalculatorclass;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(5, 3));       // 8
        System.out.println("Subtraction: " + calc.subtract(10, 4)); // 6
        System.out.println("Multiplication: " + calc.multiply(6, 7)); // 42
        System.out.println("Division: " + calc.divide(20, 4));   // 5
    }
}
