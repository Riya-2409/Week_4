package com.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

//Create the class name UnCheckedExceptionExample
public class UnCheckedExceptionExample {

    //Main Method
    public static void unCheckedException(){
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        //Use try-catch exception to handle the exception
        try{
            System.out.println("Numerator");
            //Take numerator from the user
            int numerator = sc.nextInt();
            //Take Denominator from the user
            System.out.println("Denominator");
            int denominator = sc.nextInt();
            //Find the result
            int result = numerator/denominator;
            //Print the result
            System.out.println("Result: "+result);
        }catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }catch(InputMismatchException e){
            System.out.println("Error: Please enter valid numeric values.");
        }
    }
}
