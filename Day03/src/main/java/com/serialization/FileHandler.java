package com.serialization;

import java.io.*;
import java.util.*;

//FileHandler Class
public class FileHandler {

    //Attributes
    private String filename;

    //Constructor
    public FileHandler(String filename) {
        this.filename = filename;
    }

    // Save the employee list to a file
    public void saveEmployees(List<Employee> employees) {

        //Try-Catch block
        try (ObjectOutputStream b = new ObjectOutputStream(new FileOutputStream(filename))) {
            b.writeObject(employees);
            System.out.println("Employees saved successfully to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving employees: " + e.getMessage());
        }
    }

    // Load the employee list from a file
    @SuppressWarnings("unchecked")
    public List<Employee> loadEmployees() {

        //Add employee in the list
        List<Employee> employees = new ArrayList<>();

        //Try-catch block
        try (ObjectInputStream a = new ObjectInputStream(new FileInputStream(filename))) {
            employees = (List<Employee>) a.readObject();
            System.out.println("Employees loaded successfully from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading employees: " + e.getMessage());
        }
        return employees;
    }
}
