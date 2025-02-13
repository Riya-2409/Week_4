package com.readlargefilelinebyline;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReadLargeFileTest {

    private final String testFilePath = "D:/calculator/file.txt";
    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() throws IOException {
        // Create a test file with sample content
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(testFilePath))) {
            writer.write("This is a test line.\n");
            writer.write("An error occurred while processing.\n");
            writer.write("Everything is working fine.\n");
            writer.write("Critical ERROR detected.\n");
        }

        // Redirect System.out to capture output
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testReadFileAndPrintErrors() {
        ReadLargeFile.readFileAndPrintErrors(testFilePath);

        String output = outputStream.toString();
        assertTrue(output.contains("An error occurred while processing."), "Should capture 'An error occurred while processing.'");
        assertTrue(output.contains("Critical ERROR detected."), "Should capture 'Critical ERROR detected.'");
        assertFalse(output.contains("This is a test line."), "Should not capture lines without 'error'.");
        assertFalse(output.contains("Everything is working fine."), "Should not capture lines without 'error'.");
    }
}

