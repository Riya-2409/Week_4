package com.annotation.practiceproblem.advanced.jsonfield;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JsonSerializerTest {

    @Test
    void testSerialization() {
        User user = new User("Alice", 25);
        String json = JsonSerializer.serialize(user);
        assertTrue(json.contains("user_name: Alice"));
        assertTrue(json.contains("user_age: 25"));
    }
}
