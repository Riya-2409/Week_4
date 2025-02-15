package com.extractionproblem.extractdates;

import com.extractionproblem.extractallemailaddressfromtext.EmailExtractor;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        List<String> dates = DateExtractor.extractDates(text);

        // Print extracted dates
        System.out.println(String.join(", ", dates));
    }
}
