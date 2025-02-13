package com.bytearraystream;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class ConvertImageToByteArray {

    // Method to convert an image file to a byte array
    public static byte[] convertImageToByteArray(String imagePath) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(imagePath);
             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[1024]; // Buffer size of 1KB
            int bytesRead;

            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer, 0, bytesRead);
            }

            return byteArrayOutputStream.toByteArray();
        }
    }

    // Method to write a byte array back to an image file
    public static void writeByteArrayToImage(byte[] imageData, String outputPath) throws IOException {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageData);
             FileOutputStream fileOutputStream = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = byteArrayInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }
        }
    }

    // Method to verify if two files are identical
    public static boolean verifyFiles(String filePath1, String filePath2) throws IOException {
        byte[] file1Bytes = Files.readAllBytes(new File(filePath1).toPath());
        byte[] file2Bytes = Files.readAllBytes(new File(filePath2).toPath());

        return Arrays.equals(file1Bytes, file2Bytes);
    }
}
