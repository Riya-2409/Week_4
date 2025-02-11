package com.queueinterface.reversequeue;

import java.util.*;

public class QueueReverse {

        // Method to reverse a queue using recursion
        public <T> void reverseQueue(Queue<T> queue) {
            // Base case: if the queue is empty, return
            if (queue.isEmpty()) {
                return;
            }

            // Remove the front element
            T front = queue.remove();

            // Recursively reverse the rest of the queue
            reverseQueue(queue);

            // Add the front element back to the queue
            queue.add(front);
        }


}
