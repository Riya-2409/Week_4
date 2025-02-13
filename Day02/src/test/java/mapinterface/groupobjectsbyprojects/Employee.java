package mapinterface.groupobjectsbyprojects;

import com.mapinterface.groupobjectsbyprojects.Grouping;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class Employee {
    @Test
    void testGroupByProperty() {
        List<com.mapinterface.groupobjectsbyprojects.Employee> employees = Arrays.asList(
                new com.mapinterface.groupobjectsbyprojects.Employee("Alice", "HR"),
                new com.mapinterface.groupobjectsbyprojects.Employee("Bob", "IT"),
                new com.mapinterface.groupobjectsbyprojects.Employee("Carol", "HR"),
                new com.mapinterface.groupobjectsbyprojects.Employee("David", "Finance")
        );

        Map<String, List<com.mapinterface.groupobjectsbyprojects.Employee>> groupedEmployees = Grouping.groupByProperty(employees, com.mapinterface.groupobjectsbyprojects.Employee::getDepartment);

        assertEquals(3, groupedEmployees.size());
        assertTrue(groupedEmployees.containsKey("HR"));
        assertTrue(groupedEmployees.containsKey("IT"));
        assertTrue(groupedEmployees.containsKey("Finance"));

    }
}

