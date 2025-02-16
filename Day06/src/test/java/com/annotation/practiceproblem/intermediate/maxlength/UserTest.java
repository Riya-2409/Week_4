package com.annotation.practiceproblem.intermediate.maxlength;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    void testValidUsername() {
        User user = new User("ValidUser");
        assertEquals("ValidUser", user.getUsername());
    }

    @Test
    void testUsernameExceedsMaxLength() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new User("TooLongUsername"));
        assertEquals("username exceeds maximum length of 10 characters", exception.getMessage());
    }
}
