package com.bufferedstream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class FileCopyTest {

    private static final String TEST_SOURCE_FILE = "D:/Practice/Hii.txt";
    private static final String TEST_DEST_FILE_UNBUFFERED = "D:/Practice/Hii.txt";
    private static final String TEST_DEST_FILE_BUFFERED = "D:/Practice/Hii.txt";

    @BeforeEach
    public void setUp() throws IOException {
        // Create a test file with sample data
        try (FileOutputStream fos = new FileOutputStream(TEST_SOURCE_FILE)) {
            String data = "This is a test file for file copy operations.";
            fos.write(data.getBytes());
        }
    }

    @Test
    public void testCopyFileUnbuffered() throws IOException {
        // Perform unbuffered file copy
        long timeUnbuffered = FileCopy.copyFileUnbuffered(TEST_SOURCE_FILE, TEST_DEST_FILE_UNBUFFERED);

        // Verify file existence
        File destFile = new File(TEST_DEST_FILE_UNBUFFERED);
        assertTrue(destFile.exists(), "Unbuffered copy should create the destination file");

        // Verify file content matches
        assertTrue(compareFiles(TEST_SOURCE_FILE, TEST_DEST_FILE_UNBUFFERED), "Unbuffered copy should match original file");

        // Check execution time
        assertTrue(timeUnbuffered > 0, "Execution time should be greater than zero");
    }

    @Test
    public void testCopyFileBuffered() throws IOException {
        // Perform buffered file copy
        long timeBuffered = FileCopyUtility.copyFileBuffered(TEST_SOURCE_FILE, TEST_DEST_FILE_BUFFERED);

        // Verify file existence
        File destFile = new File(TEST_DEST_FILE_BUFFERED);
        assertTrue(destFile.exists(), "Buffered copy should create the destination file");

        // Verify file content matches
        assertTrue(compareFiles(TEST_SOURCE_FILE, TEST_DEST_FILE_BUFFERED), "Buffered copy should match original file");

        // Check execution time
        assertTrue(timeBuffered > 0, "Execution time should be greater than zero");
    }

    @AfterEach
    public void tearDown() {
        // Delete test files after execution
        new File(TEST_SOURCE_FILE).delete();
        new File(TEST_DEST_FILE_UNBUFFERED).delete();
        new File(TEST_DEST_FILE_BUFFERED).delete();
    }

    // Helper method to compare file contents
    private boolean compareFiles(String file1, String file2) throws IOException {
        try (FileInputStream a = new FileInputStream(file1);
             FileInputStream b = new FileInputStream(file2)) {

            int byte1, byte2;
            while ((byte1 = a.read()) != -1 && (byte2 = b.read()) != -1) {
                if (byte1 != byte2) {
                    return false;
                }
            }
            return a.read() == b.read(); 
        }
    }
}

