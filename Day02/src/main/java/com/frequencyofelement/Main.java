package com.frequencyofelement;

import java.util.*;

//Main Class
public class Main {

    public static void main(String[] args) {
        // Sample input list of strings
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");

        // Call countFrequency to get the frequency of elements in the input list
        Map<String, Integer> result = FrequencyCounter.countFrequency(input);

        // Print the result map
        System.out.println(result);
    }
}
