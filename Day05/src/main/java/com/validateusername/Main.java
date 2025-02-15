package com.validateusername;

public class Main {

    public static void main(String args[]){
        String usernames[] = {"user_123","123user","us"};
        for (String username : usernames) {
            System.out.println(username + " → " + (UserNameValidator.isValidUserName(username) ? "Valid" : "Invalid"));
        }
    }
}
