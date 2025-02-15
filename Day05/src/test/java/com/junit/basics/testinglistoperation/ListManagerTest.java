package com.junit.basics.testinglistoperation;

import com.junit.basic.testinglistoperation.ListManger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest{

    private List<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        ListManger.addElement(numbers, 10);
        ListManger.addElement(numbers, 20);
        assertEquals(2, numbers.size());
        assertTrue(numbers.contains(10));
        assertTrue(numbers.contains(20));
    }

    @Test
    void testRemoveElement() {
        ListManger.addElement(numbers, 10);
        ListManger.addElement(numbers, 20);
        ListManger.removeElement(numbers, 10);
        assertEquals(1, numbers.size());
        assertFalse(numbers.contains(10));
    }

    @Test
    void testGetSize() {
        assertEquals(0, ListManger.getSize(numbers));
        ListManger.addElement(numbers, 10);
        assertEquals(1, ListManger.getSize(numbers));
    }
}
