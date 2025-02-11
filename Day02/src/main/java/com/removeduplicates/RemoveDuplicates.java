package com.removeduplicates;

import java.util.*;

//Create the class name RemoveDuplicates
public class RemoveDuplicates {

    // Method to remove duplicates while preserving order
    public static <T> List<T> removeDuplicates(List<T> list) {

        // Use a LinkedHashSet to maintain insertion order and remove duplicates
        Set<T> seen = new LinkedHashSet<>();
        for (T element : list) {
            // Set automatically removes duplicates
            seen.add(element);
        }

        // Convert the Set back to a List and return
        return new ArrayList<>(seen);
    }
}
