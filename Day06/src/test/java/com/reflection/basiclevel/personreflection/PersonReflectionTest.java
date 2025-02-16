package com.reflection.basiclevel.personreflection;

import java.lang.reflect.Field;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonReflectionTest {
    @Test
    void testPersonAgeModification() {
        try {
            Person person = new Person(25);
            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true);

            int initialAge = (int) ageField.get(person);
            assertEquals(25, initialAge, "Initial age should be 25");

            ageField.set(person, 30);
            assertEquals(30, person.getAge(), "Updated age should be 30");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            fail("Reflection operation failed: " + e.getMessage());
        }
    }
}