package com.trywithresource;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

class TryWithResourceExampleTest {

    
    @Test
    void testFileNotFound() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        TryWithResourceExample.antiClosingResource();

        String output = out.toString().trim();
        assertTrue(output.contains("Error reading file"));
    }
}

