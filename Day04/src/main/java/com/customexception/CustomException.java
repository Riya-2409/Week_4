package com.customexception;

//Create the class name CustomException which extends Exception class
public class CustomException extends Exception {
    //Constructor
    public CustomException(String message){
        super(message);
    }
}
