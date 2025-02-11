package com.removeduplicates;

import java.util.*;

//Main class
public class Main {

    //Main method
    public static void main(String[] args) {
        // Sample input list with duplicates
        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);

        // Call the removeDuplicates method
        List<Integer> result = RemoveDuplicates.removeDuplicates(input);

        // Print the result
        System.out.println("List after removing duplicates: " + result);
    }

}
