package com.reflection.basiclevel.calculatorreflection;

import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testMultiplyUsingReflection() {
        try {
            Calculator calculator = new Calculator();
            Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            method.setAccessible(true);
            int result = (int) method.invoke(calculator, 4, 2);
            assertEquals(8, result, "Multiplication result should be 8");
        } catch (Exception e) {
            fail("Reflection invocation failed: " + e.getMessage());
        }
    }
}