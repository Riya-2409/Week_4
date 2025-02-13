package com.serialization;

import java.io.Serializable;

//Employee class
class Employee implements Serializable {

    //Attributes
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String department;
    private double salary;

    //Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Override toString for easy display
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: $" + salary;
    }
}
