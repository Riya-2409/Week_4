package com.efficientfilecopy;

import java.io.*;

//Create the class name FileCopyUtility
public class FileCopyUtility {

    //Final Variable
    private static final int BUFFER_SIZE = 4096;

    //Create the class name copyFileBuffered
    public static long copyFileBuffered(String source, String destination) {

        //Start measuring time
        long startTime = System.nanoTime();

        //Use try-catch block
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source), BUFFER_SIZE);
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination), BUFFER_SIZE)) {

            //Create array to store try catch block
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error during buffered copy: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }
}
