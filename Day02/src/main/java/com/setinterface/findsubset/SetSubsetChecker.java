package com.setinterface.findsubset;

import java.util.*;

public class SetSubsetChecker {

    // Method to check if set1 is a subset of set2
    public <T> boolean isSubset(Set<T> set1, Set<T> set2) {
        return set2.containsAll(set1);
    }
}