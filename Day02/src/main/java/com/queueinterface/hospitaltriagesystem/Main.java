package com.queueinterface.hospitaltriagesystem;

import java.util.Comparator;
import java.util.PriorityQueue;

// Main class to implement the hospital triage system
public class Main {
    public static void main(String[] args) {
        // Create a priority queue with a custom comparator
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(Comparator.comparingInt(p -> -p.severity));


        // Adding patients to the queue
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));


        // Processing patients in order of severity (higher severity first)
        System.out.println("Patients will be treated in the following order:");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.poll()); // Remove and print the highest priority patient
        }
    }
}

