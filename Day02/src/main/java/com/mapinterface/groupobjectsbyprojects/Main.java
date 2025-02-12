package com.mapinterface.groupobjectsbyprojects;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        // Grouping employees by department using the generic method
        Map<String, List<Employee>> groupedEmployees = Grouping.groupByProperty(employees, Employee::getDepartment);

        // Print result
        groupedEmployees.forEach((department, empList) ->
                System.out.println(department + ": " + empList));
    }
}

