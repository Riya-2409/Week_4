package com.queueinterface.generatebinarynumber;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {

    // Method to generate the first N binary numbers using a queue
    public String[] generateBinaryNumbers(int N) {
        String[] result = new String[N];

        // Queue to store intermediate binary numbers
        Queue<String> queue = new LinkedList<>();
        queue.add("1");  // Start with "1"

        for (int i = 0; i < N; i++) {
            // Get the front element and store it in the result array
            String binary = queue.poll();
            result[i] = binary;

            // Generate the next two binary numbers and add them to the queue
            queue.add(binary + "0");
            queue.add(binary + "1");
        }

        return result;
    }
}

