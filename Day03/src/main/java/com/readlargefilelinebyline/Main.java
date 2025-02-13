package com.readlargefilelinebyline;

public class Main {

    public static void main(String[] args) {
        // Path to the large text file
        String filePath = "D:/calculator/file.txt";

        // Call the method to read the file and print lines containing "error"
        ReadLargeFile.readFileAndPrintErrors(filePath);
    }
}
