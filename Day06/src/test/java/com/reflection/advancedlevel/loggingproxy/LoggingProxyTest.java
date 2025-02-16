package com.reflection.advancedlevel.loggingproxy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LoggingProxyTest {

    @Test
    void testLoggingProxy() {
        // Redirect system output to capture logs
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Create proxy
        Greeting greetingProxy = LoggingProxy.createProxy(new GreetingImpl(), Greeting.class);
        String response = greetingProxy.sayHello("Bob");

        // Restore normal output
        System.setOut(System.out);

        // Verify response
        assertEquals("Hello, Bob!", response, "Greeting message should match expected output");

        // Verify if log contains method name
        String output = outputStream.toString();
        assert(output.contains("Method called: sayHello"));
    }
}
