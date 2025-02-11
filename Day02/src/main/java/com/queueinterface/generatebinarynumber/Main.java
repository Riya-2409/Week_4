package com.queueinterface.generatebinarynumber;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int N = 5; // Number of binary numbers to generate

        // Create an instance of BinaryNumberGenerator
        BinaryNumberGenerator generator = new BinaryNumberGenerator();
        String[] binaryNumbers = generator.generateBinaryNumbers(N);

        // Print the output
        System.out.println("First " + N + " Binary Numbers: " + Arrays.toString(binaryNumbers));
    }
}
