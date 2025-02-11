package com.reversealist;

import java.util.*;

//Create the class name ReverseList
public class ReverseList {

    // Method to reverse a list without built-in methods
    public static <T> void reverseList(List<T> list) {
        //Initialize pointer at left and right
        int left = 0, right = list.size() - 1;
        //Run the loop till the pointer meet in the middle
        while (left < right) {
            // Store the left element in a temporary variable
            T temp = list.get(left);
            // Swap right element to left position
            list.set(left, list.get(right));
            // Set the left element to the right position
            list.set(right, temp);
            //Move left pointer towards the centre
            left++;
            //Move right pointer towards the centre
            right--;
        }
    }
}