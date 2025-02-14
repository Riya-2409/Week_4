package com.throwvsthrows;

public class Main {

    public static void main(String[] args) {
        try {
            // Example usage with valid values
            double interest = ThrowAndThrowsExample.calculateInterest(1000, 5, 3);
            System.out.println("Calculated Interest: " + interest);

            // Example with invalid values to demonstrate exception handling
            double invalidInterest = ThrowAndThrowsExample.calculateInterest(-500, 5, 3);
            System.out.println("Calculated Interest: " + invalidInterest);
        } catch (IllegalArgumentException e) {
            // Handle exception and display message
            System.out.println(e.getMessage());
        }
    }
}
