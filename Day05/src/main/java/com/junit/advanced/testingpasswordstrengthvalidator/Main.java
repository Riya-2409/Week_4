package com.junit.advanced.testingpasswordstrengthvalidator;

public class Main {
    public static void main(String[] args) {
        String[] passwords = {"StrongP@ss1", "weakpass", "NoDigitPass", "12345678", "Short1"};

        for (String password : passwords) {
            System.out.println("Password: " + password + " → " + (PasswordValidator.isValidPassword(password) ? "Valid" : "Invalid"));
        }
    }
}
