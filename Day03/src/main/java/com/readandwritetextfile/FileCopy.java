package com.readandwritetextfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void copyFile(String sourceFile, String destinationFile) {
        FileInputStream a = null;
        FileOutputStream b = null;

        try {
            // Check if source file exists
            File srcFile = new File(sourceFile);
            if (!srcFile.exists()) {
                System.out.println("Error: Source file does not exist.");
                return;
            }

            // Initialize file input and output streams
            a = new FileInputStream(sourceFile);
            b = new FileOutputStream(destinationFile); // Creates the file if it does not exist

            // Buffer to store read data
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read from source and write to destination
            while ((bytesRead = a.read(buffer)) != -1) {
                b.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);
        } catch (IOException e) {
            System.out.println("An error occurred while handling the file: " + e.getMessage());
        } finally {
            try {
                // Close resources
                if (a != null) a.close();
                if (b != null) b.close();
            } catch (IOException e) {
                System.out.println("Error closing files: " + e.getMessage());
            }
        }
    }
}
