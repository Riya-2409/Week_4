package com.efficientfilecopy;

//Main class
public class Main {

    //Main Method
    public static void main(String[] args) {

        // Define source file path (change this to a large file for testing)
        String sourceFile = "D:/Practice/Hii.txt";

        // Run performance comparison
        PerformanceTester.comparePerformance(sourceFile);
    }
}
