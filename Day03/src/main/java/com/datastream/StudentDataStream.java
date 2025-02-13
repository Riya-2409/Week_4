package com.datastream;

import java.io.*;

public class StudentDataStream {

    // Method to store student details in a binary file
    public static void storeStudentData(String fileName, Student student) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            dataOutputStream.writeInt(student.rollNumber);
            dataOutputStream.writeUTF(student.name);
            dataOutputStream.writeDouble(student.gpa);
            System.out.println("Student data has been saved to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving student data.");
            e.printStackTrace();
        }
    }

    // Method to retrieve student details from a binary file
    public static Student retrieveStudentData(String fileName) {
        Student student = null;
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileName))) {
            int rollNumber = dataInputStream.readInt();
            String name = dataInputStream.readUTF();
            double gpa = dataInputStream.readDouble();
            student = new Student(rollNumber, name, gpa);
            System.out.println("Student data has been retrieved from the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while retrieving student data.");
            e.printStackTrace();
        }
        return student;
    }
}
