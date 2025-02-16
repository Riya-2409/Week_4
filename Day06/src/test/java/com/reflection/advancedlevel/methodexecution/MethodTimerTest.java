package com.reflection.advancedlevel.methodexecution;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MethodTimerTest {

    @Test
    void testExecutionTiming() {
        SampleService service = new SampleService();

        // Redirect console output to capture timing results
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        MethodTimer.measureExecutionTime(service);

        // Restore normal output
        System.setOut(System.out);

        // Convert output to string and check if execution times are printed
        String output = outputStream.toString();
        assertTrue(output.contains("Execution time of fastMethod:"), "fastMethod timing should be recorded");
        assertTrue(output.contains("Execution time of slowMethod:"), "slowMethod timing should be recorded");
    }
}

