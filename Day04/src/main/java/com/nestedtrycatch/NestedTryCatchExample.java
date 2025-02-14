package com.nestedtrycatch;

import java.util.Scanner;

//Create the class name NestedTryCatchExample
public class NestedTryCatchExample {

        //Main Method
        public static void nestedTryCatch() {
            //Take input from the user
            Scanner scanner = new Scanner(System.in);

            //Use try-catch block to handle exception
            try {
                // Taking array input from user
                System.out.print("Enter the number of elements in the array: ");
                int size = scanner.nextInt();
                int[] arr = new int[size];

                System.out.println("Enter " + size + " elements:");
                for (int i = 0; i < size; i++) {
                    arr[i] = scanner.nextInt();
                }

                System.out.print("Enter the index to access: ");
                int index = scanner.nextInt();

                try {
                    int element = arr[index];

                    System.out.print("Enter the divisor: ");
                    int divisor = scanner.nextInt();

                    try {
                        int result = element / divisor;
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Cannot divide by zero!");
                    }

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid array index!");
                }

            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            } finally {
                scanner.close(); // Closing the scanner to free resources
            }
        }


}
