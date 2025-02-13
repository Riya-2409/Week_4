package com.serialization;

import java.util.*;

//EmployeeManager Class
public class EmployeeManager {
    private List<Employee> employees;

    //Constructor
    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    // Add employee to the list
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Get the list of employees
    public List<Employee> getEmployees() {
        return employees;
    }

    // Display all employees
    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
        } else {
            for (Employee e : employees) {
                System.out.println(e);
            }
        }
    }
}
