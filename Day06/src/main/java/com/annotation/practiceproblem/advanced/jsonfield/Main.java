package com.annotation.practiceproblem.advanced.jsonfield;

public class Main {
    public static void main(String[] args) {
        User user = new User("JohnDoe", 30);
        String json = JsonSerializer.serialize(user);
        System.out.println("Serialized JSON: " + json);
    }
}
