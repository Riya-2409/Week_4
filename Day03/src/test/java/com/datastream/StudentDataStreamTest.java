package com.datastream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class StudentDataStreamTest {

    private static final String TEST_FILE_NAME = "D:/Addition/ File.txt";
    private Student testStudent;

    @BeforeEach
    public void setUp() {
        // Create a test student object
        testStudent = new Student(101, "Riya Soni", 3.75);
        // Store the test student data in the test file
        StudentDataStream.storeStudentData(TEST_FILE_NAME, testStudent);
    }

    @Test
    public void testStoreAndRetrieveStudentData() {
        // Retrieve student data from the file
        Student retrievedStudent = StudentDataStream.retrieveStudentData(TEST_FILE_NAME);

        // Ensure the retrieved data is not null
        assertNotNull(retrievedStudent, "Retrieved student should not be null");

        // Validate retrieved student details
        assertEquals(testStudent.rollNumber, retrievedStudent.rollNumber, "Roll number should match");
        assertEquals(testStudent.name, retrievedStudent.name, "Name should match");
        assertEquals(testStudent.gpa, retrievedStudent.gpa, 0.001, "GPA should match");
    }

    @AfterEach
    public void tearDown() {
        // Delete the test file after testing
        File file = new File(TEST_FILE_NAME);
        if (file.exists()) {
            file.delete();
        }
    }
}

