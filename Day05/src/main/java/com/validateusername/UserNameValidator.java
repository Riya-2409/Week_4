package com.validateusername;

public class UserNameValidator {

    public static boolean isValidUserName(String username){
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{5,15}");

    }
}
