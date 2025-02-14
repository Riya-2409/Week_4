package com.nestedtrycatch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class NestedTryCatchExampleTest {

    @Test
    void testValidDivision() {
        String input = "3\n10\n20\n30\n1\n2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        NestedTryCatchExample.nestedTryCatch();

        String output = out.toString();
        assertTrue(output.contains("Result: 10"));
    }

    @Test
    void testDivisionByZero() {
        String input = "3\n10\n20\n30\n1\n0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        NestedTryCatchExample.nestedTryCatch();

        String output = out.toString();
        assertTrue(output.contains("Cannot divide by zero!"));
    }

    @Test
    void testInvalidIndex() {
        String input = "3\n10\n20\n30\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        NestedTryCatchExample.nestedTryCatch();

        String output = out.toString();
        assertTrue(output.contains("Invalid array index!"));
    }
}

