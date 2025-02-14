package com.customexception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomExceptionExampleTest {

    @Test
    void testValidAge() {
        assertDoesNotThrow(() -> CustomExceptionExample.validateAge(18));
    }

    @Test
    void testAgeBelow18ThrowsException() {
        Exception exception = assertThrows(CustomException.class, () -> {
            CustomExceptionExample.validateAge(17);
        });
        assertEquals("Age must be 18 or older", exception.getMessage());
    }

    @Test
    void testAgeExactly18() {
        assertDoesNotThrow(() -> CustomExceptionExample.validateAge(18));
    }
}

