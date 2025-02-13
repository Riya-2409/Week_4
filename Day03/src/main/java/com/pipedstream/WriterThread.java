package com.pipedstream;

import java.io.IOException;
import java.io.PipedOutputStream;

//WriterThread Class
class WriterThread extends Thread {
    private PipedOutputStream pipedOutputStream;

    //Constructor
    public WriterThread(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        String data = "Hello from Writer Thread!";

        //Try-Catch block
        try {
            // Writing data to the PipedOutputStream
            pipedOutputStream.write(data.getBytes());
            pipedOutputStream.flush(); // Ensure all data is written
            System.out.println("Writer Thread: Data written to PipedOutputStream.");
        } catch (IOException e) {
            System.out.println("Writer Thread: IOException occurred.");
            e.printStackTrace();
        } //Finally Exception
        finally {
            try {
                pipedOutputStream.close(); // Close the output stream
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
