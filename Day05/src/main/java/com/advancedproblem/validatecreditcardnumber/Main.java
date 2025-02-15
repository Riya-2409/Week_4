package com.advancedproblem.validatecreditcardnumber;

public class Main {
    public static void main(String[] args) {
        String[] testCards = {"4111111111111111","5112345678901234","6111222233334444","4222222222222","5000111122223333"};

        for (String card : testCards) {
            System.out.println(card + " → " + (CreditCardValidator.isValidCreditCard(card) ? "Valid" : "Invalid"));
        }
    }
}
