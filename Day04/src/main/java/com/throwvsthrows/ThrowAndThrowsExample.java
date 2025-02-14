package com.throwvsthrows;

public class ThrowAndThrowsExample {

    // Method to calculate interest
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        // Validate input values
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        // Calculate simple interest
        return (amount * rate * years) / 100;
    }

}
