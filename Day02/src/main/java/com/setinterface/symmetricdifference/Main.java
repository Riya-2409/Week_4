package com.setinterface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Define the two sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Adding elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Adding elements to set2
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Create an instance of SetOperations
        SetOperations setOps = new SetOperations();

        // Calculate the symmetric difference
        Set<Integer> symmetricDiff = setOps.symmetricDifference(set1, set2);

        // Display the result
        System.out.println("Symmetric Difference: " + symmetricDiff);
    }
}

