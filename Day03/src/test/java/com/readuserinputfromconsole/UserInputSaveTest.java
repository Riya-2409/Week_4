package com.readuserinputfromconsole;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserInputReaderTest {

    @Test
    void testReadInput() {
        String simulatedInput = "John\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));  // Simulate user input

        UserInputReader reader = new UserInputReader();
        String result = reader.readInput("Enter your name: ");

        assertEquals("John", result);
    }

    @Test
    void testSaveToFile() throws IOException {
        SaveFile saver = new SaveFile();
        String testName = "Alice";
        String testAge = "30";
        String testLanguage = "Python";

        saver.saveToFile(testName, testAge, testLanguage);

        // Read file to verify contents
        BufferedReader reader = new BufferedReader(new FileReader("D:/calculator/file.txt"));
        String content = reader.readLine();
        reader.close();

        assertTrue(content.contains("Name: Alice"));
    }
}


