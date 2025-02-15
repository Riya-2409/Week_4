package com.advancedproblem.findrepeatingwordsinsentence;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        Set<String> repeatedWords = RepeatingWordsFinder.findRepeatingWords(text);

        // Print repeated words
        System.out.println(String.join(", ", repeatedWords));
    }
}
