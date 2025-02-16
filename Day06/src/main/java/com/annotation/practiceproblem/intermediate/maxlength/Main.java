package com.annotation.practiceproblem.intermediate.maxlength;

public class Main {

    public static void main(String[] args) {
        try {
            User user1 = new User("ShortName");
            System.out.println("Created user: " + user1.getUsername());

            User user2 = new User("TooLongUsername"); // This should throw an exception
            System.out.println("Created user: " + user2.getUsername());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
