package com.annotation.exercise.useoverride;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testMakeSound() {
        Animal myDog = new Dog();
        myDog.makeSound();
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Dog barks"));
    }
}
