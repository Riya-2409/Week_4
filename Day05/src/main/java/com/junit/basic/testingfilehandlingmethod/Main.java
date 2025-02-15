package com.junit.basic.testingfilehandlingmethod;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filename = "testfile.txt";
        String content = "Hello, File Handling in Java!";

        try {
            FileProcessor.writeToFile(filename, content);
            System.out.println("File written successfully.");

            String readContent = FileProcessor.readFromFile(filename);
            System.out.println("File Content: " + readContent);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
