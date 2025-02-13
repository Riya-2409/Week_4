package com.readandwritetextfile;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.*;

class FileCopyTest {

    private final String sourceFilePath = "D:/calculator/file.txt";
    private final String destinationFilePath = "D:/Addition/ File.txt";

    @BeforeEach
    void setUp() throws IOException {
        // Create a test source file with some content
        FileOutputStream fos = new FileOutputStream(sourceFilePath);
        fos.write("Hello, this is a test file.".getBytes());
        fos.close();
    }

    @Test
    void testCopyFile_Success() throws IOException {
        FileCopy.copyFile(sourceFilePath, destinationFilePath);

        // Check if the destination file exists
        File destFile = new File(destinationFilePath);
        assertTrue(destFile.exists(), "Destination file should exist after copying.");

        // Check if the content is the same
        byte[] sourceBytes = Files.readAllBytes(new File(sourceFilePath).toPath());
        byte[] destBytes = Files.readAllBytes(destFile.toPath());
        assertArrayEquals(sourceBytes, destBytes, "File contents should match after copying.");
    }
    
}

