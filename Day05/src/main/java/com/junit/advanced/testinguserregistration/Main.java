package com.junit.advanced.testinguserregistration;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(UserRegistration.registerUser("JohnDoe", "john@example.com", "Password123"));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
