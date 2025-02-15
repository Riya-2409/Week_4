package com.extractionproblem.extractallcapitalizedwordsfromsentence;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        List<String> capitalizedWords = CapitalizedWordsExtractor.extractCapitalizedWords(text);

        // Print extracted words
        System.out.println(String.join(", ", capitalizedWords));
    }
}
