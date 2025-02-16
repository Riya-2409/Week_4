package com.reflection.advancedlevel.dependencyinjection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DIContainerTest {

    private DIContainer container;

    @BeforeEach
    void setUp() {
        container = new DIContainer();
    }

    @Test
    void testDependencyInjection() throws Exception {
        // Register the Client class
        container.register(Client.class);

        // Retrieve the injected instance
        Client client = container.getInstance(Client.class);

        // Ensure that Client instance is created
        assertNotNull(client, "Client instance should not be null");

        // Ensure dependencies are injected
        assertNotNull(client.serviceA, "ServiceA should be injected");
        assertNotNull(client.serviceB, "ServiceB should be injected");
    }

    @Test
    void testServiceAExecution() throws Exception {
        container.register(Client.class);
        Client client = container.getInstance(Client.class);

        assertDoesNotThrow(client.serviceA::execute, "ServiceA execution should not throw an exception");
    }

    @Test
    void testServiceBExecution() throws Exception {
        container.register(Client.class);
        Client client = container.getInstance(Client.class);

        assertDoesNotThrow(client.serviceB::run, "ServiceB execution should not throw an exception");
    }
}

