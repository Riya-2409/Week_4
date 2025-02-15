package com.annotation.exercise.supressunchecked;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class WarningSuppressorTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testProcessList() {
        WarningSuppressor.processList();
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Hello"));
        assertTrue(output.contains("100"));
    }
}

