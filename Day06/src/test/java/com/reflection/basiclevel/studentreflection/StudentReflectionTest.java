package com.reflection.basiclevel.studentreflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentReflectionTest {
    @Test
    void testStudentReflection() {
        try {
            Class<?> studentClass = Student.class;
            Constructor<?> constructor = studentClass.getDeclaredConstructor();
            Object studentInstance = constructor.newInstance();

            Method displayMethod = studentClass.getMethod("display");
            displayMethod.invoke(studentInstance);
        } catch (Exception e) {
            fail("Reflection operation failed: " + e.getMessage());
        }
    }
}
