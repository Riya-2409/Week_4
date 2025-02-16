package com.annotation.practiceproblem.intermediate.logexecutiontime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private ServiceInterface proxyService;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
        ServiceInterface service = new Service();
        proxyService = ExecutionTimeHandler.createProxy(service, ServiceInterface.class);
    }

    @Test
    void testProcessData() {
        proxyService.processData();
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Processed data"));
        assertTrue(output.contains("Execution time of processData:"));
    }

    @Test
    void testFetchData() {
        proxyService.fetchData();
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Fetched data"));
        assertTrue(output.contains("Execution time of fetchData:"));
    }

    @Test
    void testHelperMethod() {
        proxyService.helperMethod();
        String output = outputStream.toString().trim();
        assertTrue(output.contains("This method is not logged."));
        assertFalse(output.contains("Execution time of"));
    }
}

