package com.readandwritetextfile;

public class Main {

    public static void main(String[] args) {
        // Define source and destination file paths
        String sourceFile = "D:/calculator/file.txt";   // Change this to your actual source file path
        String destinationFile = "D:/Addition/ File.txt"; // Change this to your actual destination file path

        // Call the copyFile method
        FileCopy.copyFile(sourceFile, destinationFile);
    }
}
