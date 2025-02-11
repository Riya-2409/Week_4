package com.setinterface.twosetsareequal;

import java.util.HashSet;
import java.util.Set;

//Main Class
public class Main {


        //Main Method
        public static void main(String[] args) {

            // Create two sets
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            // Add elements to the sets
            set1.add(1);
            set1.add(2);
            set1.add(3);

            set2.add(3);
            set2.add(2);
            set2.add(1);

            // Compare the sets
            boolean areEqual = TwoSets.areSetsEqual(set1,set2);

            // Print the result
            System.out.println("Are the two sets equal? " + areEqual);
        }

}
