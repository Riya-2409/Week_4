package com.reflection.intermediatelevel.modifystaticfield;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConfigurationTest {

    @Test
    void testModifyStaticField() throws NoSuchFieldException, IllegalAccessException {
        // Get the Configuration class reference
        Class<Configuration> configClass = Configuration.class;

        // Access the private static field API_KEY
        Field apiKeyField = configClass.getDeclaredField("API_KEY");
        apiKeyField.setAccessible(true);

        // Modify the field value using reflection
        apiKeyField.set(null, "TEST_KEY");

        // Verify that the value has been updated
        assertEquals("TEST_KEY", Configuration.getApiKey(), "API_KEY should be updated to TEST_KEY");
    }
}

