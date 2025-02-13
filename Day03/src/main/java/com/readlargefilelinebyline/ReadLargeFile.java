package com.readlargefilelinebyline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//ReadLargeFile Class
public class ReadLargeFile {

    //readFileAndPrintErrors method
    public static void readFileAndPrintErrors(String filePath) {
        BufferedReader reader = null;

        //Try-catch block
        try {
            // Create BufferedReader to read the file line by line
            reader = new BufferedReader(new FileReader(filePath));
            String line;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Check if the line contains the word "error" (case insensitive)
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // Close the BufferedReader
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
