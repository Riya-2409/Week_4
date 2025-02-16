package com.reflection.advancedlevel.objectmapper;

public class Person {
    private String name;
    private int age;
    private boolean isStudent;

    public Person() {
        // Default constructor required for reflection
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", isStudent=" + isStudent + "}";
    }

    // Getters for testing purposes
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isStudent() { return isStudent; }
}

