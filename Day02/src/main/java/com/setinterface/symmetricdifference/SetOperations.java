package com.setinterface.symmetricdifference;

import java.util.*;

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

    // Method to calculate the symmetric difference of two sets
    public Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = union(set1, set2);
        Set<Integer> intersection = intersection(set1, set2);
        union.removeAll(intersection); // Remove intersection from the union
        return union;
    }
}
