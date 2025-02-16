package com.reflection.advancedlevel.dependencyinjection;

public class Main {
    public static void main(String[] args) {
        try {
            DIContainer container = new DIContainer();

            // Register the client class
            container.register(Client.class);

            // Retrieve the instance of Client with dependencies injected
            Client client = container.getInstance(Client.class);
            client.performAction();  // Calls methods from injected services

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
