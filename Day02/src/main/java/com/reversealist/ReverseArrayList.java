package com.reversealist;

import java.util.*;

//Create the class name ReverseArrayList
public class ReverseArrayList {

    // Method to reverse an ArrayList
    public static <T> List<T> reverseArrayList(List<T> list) {
        // Create a new list to store reversed elements
        List<T> reversedList = new ArrayList<>();
        // Iterate from the last index to the first
        for (int i = list.size() - 1; i >= 0; i--) {
            // Add elements in reverse order
            reversedList.add(list.get(i));
        }
        // Return the newly created reversed list
        return reversedList;
    }
}
