package com.junit.advanced.testingdateformatter;

public class Main {
    public static void main(String[] args) {
        String[] testDates = {"2025-02-15", "1999-12-31", "2024-07-27", "invalid-date"};

        for (String date : testDates) {
            System.out.println("Input: " + date + " → Output: " + DateFormatter.formatDate(date));
        }
    }
}
