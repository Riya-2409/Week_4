package com.reversealist;

import java.util.*;

//Create the class name ReverseLinkedList
public class ReverseLinkedList {

    // Method to reverse a LinkedList
    public static <T> List<T> reverseLinkedList(LinkedList<T> list) {
        // Create a new linked list to store reversed elements
        LinkedList<T> reversedList = new LinkedList<>();
        // Use built-in descending iterator to get elements in reverse order
        Iterator<T> iterator = list.descendingIterator();
        // Iterate through the reversed elements
        while (iterator.hasNext()) {
            // Add each element to the new reversed list
            reversedList.add(iterator.next());
        }
        return reversedList;
    }
}
