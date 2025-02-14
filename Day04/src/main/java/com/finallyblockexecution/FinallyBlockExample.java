package com.finallyblockexecution;

import java.util.Scanner;
public class FinallyBlockExample {

    public static void finallyBlockExecution() {
        Scanner scanner = new Scanner(System.in);

        try {
            // Take input from the user
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Perform division
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception e) {
            // Handle other exceptions (e.g., input mismatch)
            System.out.println("Invalid input! Please enter valid integers.");
        } finally {
            // This block always executes
            System.out.println("Operation completed.");
            scanner.close();
        }
    }
}
