package com.multiplecatchblock;

import java.util.Scanner;

//Create the class name MultipleCatchBlockExample
public class MultipleCatchBlockExample {

       //Main Method
        public static void multipleCatchBlock() {
            //Take input from the user
            Scanner sc = new Scanner(System.in);
            //Use try-catch block to handle exception
            try {
                System.out.print("Enter the number of element in array:");
                int size = sc.nextInt();
                int arr[] = new int[size];

                System.out.println("Enter " + size + " Element");
                for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }

                System.out.print("Enter the index:");
                int index = sc.nextInt();

                if (arr == null) {
                    throw new NullPointerException();
                }
                if (index < 0 || index >= arr.length) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                System.out.println("Value at index " + index + ":" + arr[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index!"+e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("Array is not initialized!"+e.getMessage());
            }
        }
}


