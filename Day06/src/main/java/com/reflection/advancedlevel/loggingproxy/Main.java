package com.reflection.advancedlevel.loggingproxy;

public class Main {
    public static void main(String[] args) {
        Greeting greetingProxy = LoggingProxy.createProxy(new GreetingImpl(), Greeting.class);

        String message = greetingProxy.sayHello("Alice");
        System.out.println("Response: " + message);
    }
}

