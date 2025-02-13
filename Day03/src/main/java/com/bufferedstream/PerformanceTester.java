package com.efficientfilecopy;

//Create the class name PerformanceTester
public class PerformanceTester {

    //Create the method name comparePerformance
    public static void comparePerformance(String sourceFile) {

        //Define path
        String destFileUnbuffered = "D:/calculator/file.txt";
        String destFileBuffered = "D:/Addition/File.txt";

        // Perform file copy using unbuffered streams
        long timeUnbuffered = FileCopy.copyFileUnbuffered(sourceFile, destFileUnbuffered);
        System.out.println("Unbuffered Copy Time: " + timeUnbuffered + " ns (" + timeUnbuffered / 1_000_000 + " ms)");

        // Perform file copy using buffered streams
        long timeBuffered = FileCopyUtility.copyFileBuffered(sourceFile, destFileBuffered);
        System.out.println("Buffered Copy Time: " + timeBuffered + " ns (" + timeBuffered / 1_000_000 + " ms)");

        // Compare Performance
        double speedup = (double) timeUnbuffered / timeBuffered;
        System.out.println("\nBuffered streams are approximately " + String.format("%.2f", speedup) + " times faster than unbuffered streams.");
    }
}
