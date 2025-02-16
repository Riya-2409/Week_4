package com.reflection.intermediatelevel.retriveannotation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthorAnnotationTest {

    @Test
    void testAuthorAnnotationExists() {
        // Get the Book class reference
        Class<Book> bookClass = Book.class;

        // Check if the @Author annotation is present
        assertTrue(bookClass.isAnnotationPresent(Author.class), "Book class should have @Author annotation");

        // Retrieve the annotation
        Author author = bookClass.getAnnotation(Author.class);

        // Verify the annotation's name value
        assertEquals("John Doe", author.name(), "Author name should be 'John Doe'");
    }
}

