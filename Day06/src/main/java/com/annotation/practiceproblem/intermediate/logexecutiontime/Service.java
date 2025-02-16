package com.annotation.practiceproblem.intermediate.logexecutiontime;

public class Service implements ServiceInterface {

    @LogExecutionTime
    public void processData() {
        try {
            Thread.sleep(500); // Simulating a time-consuming task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Processed data");
    }

    @LogExecutionTime
    public void fetchData() {
        try {
            Thread.sleep(300); // Simulating another task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fetched data");
    }

    public void helperMethod() {
        System.out.println("This method is not logged.");
    }
}

