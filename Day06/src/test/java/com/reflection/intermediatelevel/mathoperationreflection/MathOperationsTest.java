package com.reflection.intermediatelevel.mathoperationreflection;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {

    @Test
    void testAdd() {
        MathOperations mathOperations = new MathOperations();
        assertEquals(5, mathOperations.add(2, 3));
    }

    @Test
    void testSubtract() {
        MathOperations mathOperations = new MathOperations();
        assertEquals(1, mathOperations.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        MathOperations mathOperations = new MathOperations();
        assertEquals(6, mathOperations.multiply(2, 3));
    }

    @Test
    void testReflectionInvocation() throws Exception {
        Class<?> mathClass = MathOperations.class;
        Object mathInstance = mathClass.getDeclaredConstructor().newInstance();

        Method addMethod = mathClass.getMethod("add", int.class, int.class);
        Object addResult = addMethod.invoke(mathInstance, 4, 5);
        assertEquals(9, addResult);

        Method subtractMethod = mathClass.getMethod("subtract", int.class, int.class);
        Object subtractResult = subtractMethod.invoke(mathInstance, 10, 5);
        assertEquals(5, subtractResult);

        Method multiplyMethod = mathClass.getMethod("multiply", int.class, int.class);
        Object multiplyResult = multiplyMethod.invoke(mathInstance, 3, 3);
        assertEquals(9, multiplyResult);
    }
}
