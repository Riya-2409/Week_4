package com.serialization;

import java.util.List;

//Main Class
public class Main {

    //Main Method
    public static void main(String[] args) {
        // Serialized file name
        String filename = "D:/calculator/file.txt";

        //Create FileHandler and EmployeeManger Object
        FileHandler fileHandler = new FileHandler(filename);
        EmployeeManager manager = new EmployeeManager();

        // Add some employees
        manager.addEmployee(new Employee(1, "Riya", "HR", 50000));
        manager.addEmployee(new Employee(2, "Shubhi", "IT", 70000));
        manager.addEmployee(new Employee(3, "Pragya", "Finance", 60000));

        // Save employees to file
        fileHandler.saveEmployees(manager.getEmployees());

        // Load employees from file
        List<Employee> loadedEmployees = fileHandler.loadEmployees();

        // Display employees
        System.out.println("\nLoaded Employee List:");
        for (Employee emp : loadedEmployees) {
            System.out.println(emp);
        }
    }
}
