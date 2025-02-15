package com.junit.basic.testingperformance;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting long-running task...");
        System.out.println(PerformanceTester.longRunningTask());
    }
}
