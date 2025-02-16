package com.reflection.advancedlevel.methodexecution;

public class SampleService {

    @Timed
    public void fastMethod() {
        System.out.println("Executing fastMethod...");
    }

    @Timed
    public void slowMethod() {
        try {
            Thread.sleep(500);  // Simulating a slow method
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Executing slowMethod...");
    }

    public void nonTimedMethod() {
        System.out.println("Executing nonTimedMethod...");
    }
}

