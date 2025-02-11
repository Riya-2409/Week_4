package com.findnthelementfromend;

import java.util.LinkedList;
import java.util.ListIterator;


public class NthElementFromEnd<T> {


    public T findNthFromEnd(LinkedList<T> list, int N) {
        // If list is empty or N is invalid, return null
        if (list == null || list.isEmpty() || N <= 0) {
            return null;
        }


        // Create two iterators
        ListIterator<T> first = list.listIterator();
        ListIterator<T> second = list.listIterator();


        // Move 'first' pointer N steps forward
        for (int i = 0; i < N; i++) {
            if (!first.hasNext()) {
                return null; // N is larger than list size, return null
            }
            first.next();
        }
        // Move both pointers one step at a time until 'first' reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }


        // Now 'second' is at the Nth element from the end
        return second.next();
    }
}