package com.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {

    public static void antiClosingResource() {
        // Using try-with-resources to automatically close resources
        try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))) {
            // Read and print the first line of the file
            String firstLine = reader.readLine();
            if (firstLine != null) {
                System.out.println("First line of file: " + firstLine);
            } else {
                System.out.println("File is empty.");
            }
        } catch (IOException e) {
            // Handle exception if the file is not found or cannot be read
            System.out.println("Error reading file");
        }
    }
}
