package com.setinterface.unionandintersectionoftwosets;

import java.util.HashSet;
import java.util.Set;

//Create the class name SetOperations
public class SetOperations {

    // Method to calculate the union of two sets
    public Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    // Method to calculate the intersection of two sets
    public Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
}

