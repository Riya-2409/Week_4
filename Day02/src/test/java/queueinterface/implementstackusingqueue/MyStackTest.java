package queueinterface.implementstackusingqueue;

import com.queueinterface.implementstackusingqueue.MyStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;

class MyStackTest {
    private MyStack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new MyStack<>();
    }

    @Test
    void testPushAndTop() {
        stack.push(1);
        assertEquals(1, stack.top(), "Top should be 10 after pushing 10");

        stack.push(2);
        assertEquals(2, stack.top(), "Top should be 20 after pushing 20");
    }

    @Test
    void testPop() {
        stack.push(5);
        stack.push(15);
        stack.push(25);

        assertEquals(25, stack.pop(), "Popped element should be 25");
        assertEquals(15, stack.top(), "Top should be 15 after popping 25");
        assertEquals(15, stack.pop(), "Popped element should be 15");
        assertEquals(5, stack.pop(), "Popped element should be 5");
    }

    @Test
    void testIsEmpty() {
        assertTrue(stack.isEmpty(), "Stack should be empty initially");
        stack.push(1);
        assertFalse(stack.isEmpty(), "Stack should not be empty after pushing an element");
        stack.pop();
        assertTrue(stack.isEmpty(), "Stack should be empty after popping all elements");
    }

    @Test
    void testPopOnEmptyStack() {
        assertThrows(NoSuchElementException.class, stack::pop, "Popping from empty stack should throw exception");
    }

    @Test
    void testTopOnEmptyStack() {
        assertThrows(NoSuchElementException.class, stack::top, "Calling top on empty stack should throw exception");
    }
}

