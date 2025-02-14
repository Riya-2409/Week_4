package com.exceptonpropagationinmethod;

import com.exceptionpropagationinmethod.ExceptionPropagationExample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExceptionPropagationExampleTest {

    @Test
    void testExceptionPropagation() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            ExceptionPropagationExample.method2();
        });
        assertEquals("/ by zero", exception.getMessage());
    }
}

