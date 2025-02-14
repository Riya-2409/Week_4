package com.multiplecatchblock;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MultipleCatchBlockExampleTest {

    @Test
    void testValidIndex() {
        String input = "3\n10\n20\n30\n1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MultipleCatchBlockExample.multipleCatchBlock();

        String output = out.toString();
        assertTrue(output.contains("Value at index 1:20"));
    }
}

