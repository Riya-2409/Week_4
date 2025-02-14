package com.customexception;

import java.util.Scanner;

//Main Class
public class Main {
    //Main Method
    public static void main(String args[]){
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        //Use try-catch block to handle exception
        try{
            System.out.println("Enter the age:");
            //Take age from the user
            int age = sc.nextInt();
            // Call the validateAge method to check if the user meets the age requirement
            CustomExceptionExample.validateAge(age);
        }catch(CustomException e){
            System.out.println("Caught Custom Exception "+e.getMessage());
        }catch(Exception e) {
            System.out.println("Invalid input! Please enter a valid age "+e.getMessage());
        }
    }
}
