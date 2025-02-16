package com.annotation.practiceproblem.advanced.cacheresult;

public class Main {
    public static void main(String[] args) {
        ExpensiveService service = new ExpensiveService();
        System.out.println("Result: " + service.computeSquare(4));
        System.out.println("Result: " + service.computeSquare(4)); // Should return cached result
    }
}

