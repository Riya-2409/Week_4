package com.advancedproblem.validatesocialsecuritynumber;

public class SSNValidator {
    public static boolean isValidSSN(String ssn) {
        String regex = "^\\d{3}-\\d{2}-\\d{4}$"; // Format: XXX-XX-XXXX
        return ssn.matches(regex);
    }
}
