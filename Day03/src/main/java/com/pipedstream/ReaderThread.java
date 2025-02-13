package com.pipedstream;

import java.io.IOException;
import java.io.PipedInputStream;

//ReaderThread Class
class ReaderThread extends Thread {
    private PipedInputStream pipedInputStream;

    //Constructor
    public ReaderThread(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {

        //Use try-catch block
        try {
            byte[] buffer = new byte[1024];
            int bytesRead = pipedInputStream.read(buffer);
            if (bytesRead != -1) {
                String data = new String(buffer, 0, bytesRead);
                System.out.println("Reader Thread: Data received: " + data);
            }
        } catch (IOException e) {
            System.out.println("Reader Thread: IOException occurred.");
            e.printStackTrace();
        }
        finally {
            try {
                pipedInputStream.close(); // Close the input stream
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
