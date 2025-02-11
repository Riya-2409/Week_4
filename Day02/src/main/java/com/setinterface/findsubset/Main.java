package com.setinterface.findsubset;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Create two sets
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Create an instance of SetSubsetChecker
        SetSubsetChecker checker = new SetSubsetChecker();

        // Check if set1 is a subset of set2
        boolean result = checker.isSubset(set1, set2);

        // Print the result
        System.out.println("Is set1 a subset of set2? " + result);
    }
}
