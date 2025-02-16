package com.reflection.advancedlevel.methodexecution;

public class Main {
    public static void main(String[] args) {
        SampleService service = new SampleService();
        MethodTimer.measureExecutionTime(service);
    }
}

