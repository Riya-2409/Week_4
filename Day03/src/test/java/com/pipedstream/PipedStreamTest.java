package com.pipedstream;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class PipedStreamTest {

    @Test
    void testPipedCommunication() throws IOException, InterruptedException {
        // Create piped input and output streams
        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();

        // Connect the streams
        pipedInputStream.connect(pipedOutputStream);

        // Create writer and reader threads
        WriterThread writerThread = new WriterThread(pipedOutputStream);
        ReaderThread readerThread = new ReaderThread(pipedInputStream);

        // Start threads
        writerThread.start();
        readerThread.start();

        // Wait for threads to complete execution
        writerThread.join();
        readerThread.join();

        // Verify data transfer
        byte[] buffer = new byte[1024];
        int bytesRead = pipedInputStream.read(buffer);
        String receivedData = new String(buffer, 0, bytesRead).trim();

        // Expected data from WriterThread
        String expectedData = "Hello from Writer Thread!";

        // Check if the data received matches the expected data
        assertEquals(expectedData, receivedData, "The data received should match the expected data.");
    }
}

