package com.throwvsthrows;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThrowAndThrowsExampleTest {

    @Test
    void testValidInterestCalculation() {
        double interest = ThrowAndThrowsExample.calculateInterest(1000, 5, 3);
        assertEquals(150.0, interest, 0.001);
    }

    @Test
    void testNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ThrowAndThrowsExample.calculateInterest(-500, 5, 3);
        });
        assertEquals("Invalid input: Amount and rate must be positive", exception.getMessage());
    }

    @Test
    void testNegativeRate() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ThrowAndThrowsExample.calculateInterest(1000, -5, 3);
        });
        assertEquals("Invalid input: Amount and rate must be positive", exception.getMessage());
    }
}

