package com.annotation.practiceproblem.intermediate.logexecutiontime;

public class Main {

    public static void main(String[] args) {
        ServiceInterface service = new Service();
        ServiceInterface proxyService = ExecutionTimeHandler.createProxy(service, ServiceInterface.class);

        proxyService.processData();
        proxyService.fetchData();
        proxyService.helperMethod();
    }
}




