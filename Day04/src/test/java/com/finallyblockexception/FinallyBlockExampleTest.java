package com.finallyblockexception;

import com.finallyblockexecution.FinallyBlockExample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class FinallyBlockExampleTest {

    @Test
    void testValidDivision() {
        String input = "10\n2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        FinallyBlockExample.finallyBlockExecution();

        String output = out.toString();
        assertTrue(output.contains("Result: 5"));
        assertTrue(output.contains("Operation completed."));
    }
}

