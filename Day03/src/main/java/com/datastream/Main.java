package com.datastream;

public class Main {

    public static void main(String[] args) {
        // File name for storing student data
        String fileName = "D:/Addition/ File.txt";

        // Create a student object
        Student student = new Student(101, "Riya Soni", 3.75);

        // Store the student data
        StudentDataStream.storeStudentData(fileName, student);

        // Retrieve and display the student data
        Student retrievedStudent = StudentDataStream.retrieveStudentData(fileName);
        if (retrievedStudent != null) {
            System.out.println("Retrieved Student Details:");
            System.out.println("Roll Number: " + retrievedStudent.rollNumber);
            System.out.println("Name: " + retrievedStudent.name);
            System.out.println("GPA: " + retrievedStudent.gpa);
        }
    }
}
