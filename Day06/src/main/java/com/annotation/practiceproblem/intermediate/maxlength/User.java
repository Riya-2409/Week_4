package com.annotation.practiceproblem.intermediate.maxlength;

public class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        this.username = username;
        MaxLengthValidator.validate(this);
    }

    public String getUsername() {
        return username;
    }
}
