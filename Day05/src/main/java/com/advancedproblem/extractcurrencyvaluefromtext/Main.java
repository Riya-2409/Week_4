package com.advancedproblem.extractcurrencyvaluefromtext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        List<String> extractedValues = CurrencyExtractor.extractCurrencyValues(text);

        // Print extracted currency values
        System.out.println(String.join(", ", extractedValues));
    }
}
