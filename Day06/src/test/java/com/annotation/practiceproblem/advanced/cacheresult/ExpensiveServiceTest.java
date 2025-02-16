package com.annotation.practiceproblem.advanced.cacheresult;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpensiveServiceTest {

    @Test
    void testComputeSquareCaching() {
        ExpensiveService service = new ExpensiveService();
        int firstCall = service.computeSquare(5);
        int secondCall = service.computeSquare(5);
        assertEquals(25, firstCall);
        assertEquals(25, secondCall);
    }
}
