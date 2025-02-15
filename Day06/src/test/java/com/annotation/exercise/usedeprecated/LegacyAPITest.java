package com.annotation.exercise.usedeprecated;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class LegacyAPITest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testOldFeature() {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Old feature: This method is deprecated."));
    }

    @Test
    void testNewFeature() {
        LegacyAPI api = new LegacyAPI();
        api.newFeature();
        String output = outputStream.toString().trim();
        assertTrue(output.contains("New feature: Use this method instead."));
    }
}
