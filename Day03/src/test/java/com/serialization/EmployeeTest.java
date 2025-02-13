package com.serialization;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private final String testFilePath = "D:/calculator/file.txt";
    private FileHandler fileHandler;
    private EmployeeManager manager;

    @BeforeEach
    void setUp() {
        fileHandler = new FileHandler(testFilePath);
        manager = new EmployeeManager();
    }

    @Test
    void testSaveAndLoadEmployees() {
        manager.addEmployee(new Employee(1, "Riya", "HR", 50000));
        manager.addEmployee(new Employee(2, "Pragya", "IT", 70000));
        manager.addEmployee(new Employee(3, "Shubhi", "Finance", 60000));

        fileHandler.saveEmployees(manager.getEmployees());
        List<Employee> loadedEmployees = fileHandler.loadEmployees();

        assertNotNull(loadedEmployees, "Loaded employee list should not be null.");
        assertEquals(3, loadedEmployees.size(), "There should be three employees loaded.");
        assertEquals("Riya", loadedEmployees.get(0).toString().split(", ")[1].split(": ")[1], "First employee should be Alice.");
        assertEquals("Pragya", loadedEmployees.get(1).toString().split(", ")[1].split(": ")[1], "Second employee should be Bob.");
        assertEquals("Shubhi", loadedEmployees.get(2).toString().split(", ")[1].split(": ")[1], "Third employee should be Charlie.");
    }
}
