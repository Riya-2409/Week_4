package com.checkedandcustomexception;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
