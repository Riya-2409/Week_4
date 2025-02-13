package com.pipedstream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

//Main Class
public class Main {

    //Main Method
    public static void main(String[] args) {
        // Create PipedInputStream and PipedOutputStream for inter-thread communication

        //PipedInputStream and PipedOutputStream Object
        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();

        try {
            // Connect the output stream to the input stream
            pipedInputStream.connect(pipedOutputStream);
        } catch (IOException e) {
            System.out.println("Error connecting piped streams.");
            e.printStackTrace();
            return;
        }

        // Create and start writer and reader threads
        WriterThread writerThread = new WriterThread(pipedOutputStream);
        ReaderThread readerThread = new ReaderThread(pipedInputStream);

        writerThread.start();
        readerThread.start();
    }
}
