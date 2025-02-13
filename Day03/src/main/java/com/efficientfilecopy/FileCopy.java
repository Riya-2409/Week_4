package com.efficientfilecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Create the class name FileCopy
public class FileCopy {

    //Final variable
    private static final int BUFFER_SIZE = 4096;

    //Create the class name copyFileUnbuffered
    public static long copyFileUnbuffered(String source, String destination) {

        //Start measuring time
        long startTime = System.nanoTime();

        //Use Try-catch block
        try (FileInputStream fileInputStream = new FileInputStream(source);
             FileOutputStream fileOutputStream = new FileOutputStream(destination)) {

            //Create array to store buffer size
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error during unbuffered copy: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }
}
