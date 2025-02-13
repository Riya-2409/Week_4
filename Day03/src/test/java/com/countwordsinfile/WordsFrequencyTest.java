package com.countwordsinfile;

import com.countswordsinfile.WordsFrequency;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordsFrequencyTest {

    @Test
    public void testCountWordsInFile() {
        // Redirect System.out to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Provide a sample file path (ensure the file exists)
        String filePath = "D:/calculator/file.txt";
        WordsFrequency.countWordsInFile(filePath);

        // Capture output and check expected words are present
        String output = outputStream.toString().toLowerCase();
        assertTrue(output.contains("code: 1"));
        assertTrue(output.contains("this: 2"));

        // Reset System.out
        System.setOut(System.out);
    }
}

