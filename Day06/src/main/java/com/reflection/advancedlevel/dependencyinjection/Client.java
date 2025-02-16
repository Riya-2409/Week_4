package com.reflection.advancedlevel.dependencyinjection;

public class Client {

    @Inject
    ServiceA serviceA;

    @Inject
    ServiceB serviceB;

    public void performAction() {
        serviceA.execute();
        serviceB.run();
    }
}

