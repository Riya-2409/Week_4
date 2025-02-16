package com.reflection.advancedlevel.objectmapper;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class ObjectMapperTest {

    @Test
    void testObjectMapping() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Bob");
        properties.put("age", 30);
        properties.put("isStudent", true);

        Person person = ObjectMapper.toObject(Person.class, properties);

        assertEquals("Bob", person.getName(), "Name should be mapped correctly");
        assertEquals(30, person.getAge(), "Age should be mapped correctly");
        assertTrue(person.isStudent(), "isStudent should be mapped correctly");
    }

    @Test
    void testUnknownFieldIgnored() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Charlie");
        properties.put("nonExistingField", "ignored");

        Person person = ObjectMapper.toObject(Person.class, properties);

        assertEquals("Charlie", person.getName(), "Valid fields should be mapped");
    }

    @Test
    void testEmptyProperties() {
        Map<String, Object> properties = new HashMap<>();
        Person person = ObjectMapper.toObject(Person.class, properties);

        assertNull(person.getName(), "Name should be null for empty properties");
        assertEquals(0, person.getAge(), "Age should be 0 for empty properties");
        assertFalse(person.isStudent(), "isStudent should be false for empty properties");
    }
}

