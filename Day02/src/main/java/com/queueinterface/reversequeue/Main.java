package com.queueinterface.reversequeue;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Create a queue and add elements
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Create an instance of QueueReverser
        QueueReverse reverser = new QueueReverse();

        // Print the original queue
        System.out.println("Original Queue: " + queue);

        // Reverse the queue
        reverser.reverseQueue(queue);

        // Print the reversed queue
        System.out.println("Reversed Queue: " + queue);
    }
}

