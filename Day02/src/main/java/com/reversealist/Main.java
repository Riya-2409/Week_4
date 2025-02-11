package com.reversealist;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Using ArrayList
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original ArrayList: " + arrayList);
        ReverseList.reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        // Using LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original LinkedList: " + linkedList);
        ReverseList.reverseList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);

    }
}
