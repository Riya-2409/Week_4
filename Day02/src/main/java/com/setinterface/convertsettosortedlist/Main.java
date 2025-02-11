package com.setinterface.convertsettosortedlist;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Create an instance of SetToSortedList
        SetToSortedList converter = new SetToSortedList();

        // Test with a Set of Integers
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(5);
        integerSet.add(3);
        integerSet.add(9);
        integerSet.add(1);

        List<Integer> sortedIntegerList = converter.convertToSortedList(integerSet);
        System.out.println("Sorted Integer List: " + sortedIntegerList);

    }
}
