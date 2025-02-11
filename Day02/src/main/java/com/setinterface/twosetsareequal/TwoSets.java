package com.setinterface.twosetsareequal;

import java.util.Set;

public class TwoSets {

    // Method to compare two sets for equality
    public static <T> boolean areSetsEqual(Set<T> set1, Set<T> set2) {
        return set1.equals(set2);
    }
}