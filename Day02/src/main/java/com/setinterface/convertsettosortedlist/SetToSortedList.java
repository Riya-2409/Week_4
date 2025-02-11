package com.setinterface.convertsettosortedlist;

import java.util.*;
import java.util.stream.Collectors;

public class SetToSortedList {

    // Generic method to convert a Set to a sorted List
    public <T extends Comparable<T>> List<T> convertToSortedList(Set<T> set) {
        // Convert the set to a list and sort it
        return set.stream()
                .sorted()              // Sort the stream in ascending order
                .collect(Collectors.toList()); // Collect the elements into a List
    }
}

