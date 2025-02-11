package com.frequencyofelement;

import java.util.*;

//Create the class name FrequencyCounter
public class FrequencyCounter {

    // Generic method to count the frequency of each element in the list
    public static <T> Map<T, Integer> countFrequency(List<T> list) {
        // Create a HashMap to store the frequency of each element
        Map<T, Integer> frequencyMap = new HashMap<>();

        // Loop through each element in the list
        for (T element : list) {
            // Update the frequency of the current element in the map
            // getOrDefault will return 0 if the element is not yet in the map
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        // Return the frequency map
        return frequencyMap;
    }
}