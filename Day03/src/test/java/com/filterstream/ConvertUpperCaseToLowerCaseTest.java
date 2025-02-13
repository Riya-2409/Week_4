package com.filterstream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class ConvertUpperCaseToLowerCaseTest {

    private static final String TEST_INPUT_FILE = "D:/calculator/file.txt";
    private static final String TEST_OUTPUT_FILE = "D:/Addition/ File.txt";

    @BeforeEach
    public void setUp() throws IOException {
        // Create a test input file with uppercase content
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEST_INPUT_FILE))) {
            writer.write("HELLO WORLD!");
            writer.newLine();
            writer.write("THIS IS A TEST FILE.");
        }
    }

    @Test
    public void testConvertFileContentToLowercase() throws IOException {
        // Perform the conversion
        ConvertUpperCaseToLowerCase.convertFileContentToLowercase(TEST_INPUT_FILE, TEST_OUTPUT_FILE);

        // Verify that the output file exists
        File outputFile = new File(TEST_OUTPUT_FILE);
        assertTrue(outputFile.exists(), "Output file should be created");

        // Read and verify the content of the output file
        try (BufferedReader reader = new BufferedReader(new FileReader(TEST_OUTPUT_FILE))) {
            assertEquals("hello world!", reader.readLine(), "First line should be converted to lowercase");
            assertEquals("this is a test file.", reader.readLine(), "Second line should be converted to lowercase");
        }
    }

    @AfterEach
    public void tearDown() {
        // Delete test files after execution
        new File(TEST_INPUT_FILE).delete();
        new File(TEST_OUTPUT_FILE).delete();
    }
}

