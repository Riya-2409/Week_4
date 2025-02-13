package com.filterstream;

import java.io.*;

//Create the class name ConvertUpperCaseToLowerCase
public class ConvertUpperCaseToLowerCase {

    // Method to read from the input file, convert content to lowercase, and write to the output file
    public static void convertFileContentToLowercase(String inputFile, String outputFile) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            // Create a BufferedReader to read from the input file
            reader = new BufferedReader(new FileReader(inputFile));

            // Create a BufferedWriter to write to the output file
            writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            // Read each line from the input file
            while ((line = reader.readLine()) != null) {
                // Convert the line to lowercase and write it to the output file
                writer.write(line.toLowerCase());
                writer.newLine(); // Add a new line after writing each line
            }

            System.out.println("Content has been converted to lowercase and saved to '" + outputFile + "'.");

        } catch (IOException e) {
            // Handle any IOException that occurs during reading or writing files
            System.out.println("An error occurred during file operations.");
            e.printStackTrace();
        } finally {
            try {
                // Close the readers and writers to release resources
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file resources.");
                e.printStackTrace();
            }
        }
    }
}
