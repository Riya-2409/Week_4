package com.customexception;

//Create the class name CustomExceptionExample
public class CustomExceptionExample {

    //Create the method name validateAge
    public static void validateAge(int age) throws CustomException{
        //Check the condition,If the age is below 18,throw the custom exception
        if(age<18){
            throw new CustomException("Age must be 18 or older");
        }
        // If age is valid, print access granted
        System.out.println("Access Granted");
    }

}

