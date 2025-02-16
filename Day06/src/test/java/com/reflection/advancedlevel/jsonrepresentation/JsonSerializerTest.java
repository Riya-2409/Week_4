package com.reflection.advancedlevel.jsonrepresentation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonSerializerTest {

    @Test
    void testJsonSerialization() {
        Person person = new Person("Bob", 30, true);
        String json = JsonSerializer.toJson(person);

        String expectedJson = "{\"name\": \"Bob\", \"age\": 30, \"isStudent\": true}";

        assertEquals(expectedJson, json, "JSON output should match expected format");
    }

    @Test
    void testNullObjectSerialization() {
        String json = JsonSerializer.toJson(null);
        assertEquals("null", json, "Null object should return 'null' string");
    }
}

