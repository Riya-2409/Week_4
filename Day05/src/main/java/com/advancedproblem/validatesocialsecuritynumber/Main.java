package com.advancedproblem.validatesocialsecuritynumber;

public class Main {

    public static void main(String[] args) {
        String[] testSSNs = {"123-45-6789","123456789"};

        for (String ssn : testSSNs) {
            System.out.println(ssn + " → " + (SSNValidator.isValidSSN(ssn) ? "Valid" : "Invalid"));
        }
    }
}
