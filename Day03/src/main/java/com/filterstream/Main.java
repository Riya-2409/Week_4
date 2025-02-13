package com.filterstream;

public class Main {

    //Main Method
    public static void main(String[] args) {
        // File paths
        String inputFile = "D:/calculator/file.txt";  // Input file path
        String outputFile = "D:/Addition/ File.txt"; // Output file path

        // Call the method to convert the content of input file to lowercase and save it to the output file
        ConvertUpperCaseToLowerCase.convertFileContentToLowercase(inputFile, outputFile);
    }
}
