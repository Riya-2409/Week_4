package com.findnthelementfromend;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");


        // Create an object of the class
        NthElementFromEnd<String> finder = new NthElementFromEnd<>();


        // Find the 2nd element from the end
        String result = finder.findNthFromEnd(list, 2);


        // Print the result
        if (result != null) {
            System.out.println("Nth element from end: " + result);
        } else {
            System.out.println("Invalid input or N is too large.");
        }
    }
}
