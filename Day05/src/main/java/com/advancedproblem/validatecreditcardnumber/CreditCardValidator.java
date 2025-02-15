package com.advancedproblem.validatecreditcardnumber;

public class CreditCardValidator {
    public static boolean isValidCreditCard(String cardNumber) {
        String visaRegex = "^4\\d{15}$";      // Visa: Starts with 4, exactly 16 digits
        String masterCardRegex = "^5\\d{15}$"; // MasterCard: Starts with 5, exactly 16 digits

        return cardNumber.matches(visaRegex) || cardNumber.matches(masterCardRegex);
    }
}
