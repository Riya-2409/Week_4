package com.bytearraystream;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        // Define the file paths
        String inputImagePath = "C:/Users/hp/Downloads/Teddy.jpg";  // Replace with your actual image path
        String outputImagePath = "C:/Users/hp/Downloads/Flower.jpg";  // Destination path

        try {
            // Convert image to byte array
            byte[] imageData = ConvertImageToByteArray.convertImageToByteArray(inputImagePath);
            System.out.println("Image successfully converted to byte array.");

            // Write byte array back to an image file
            ConvertImageToByteArray.writeByteArrayToImage(imageData, outputImagePath);
            System.out.println("Byte array successfully written back to image file.");

            // Verify that the new file is identical to the original
            if (ConvertImageToByteArray.verifyFiles(inputImagePath, outputImagePath)) {
                System.out.println("Verification successful: The new image is identical to the original.");
            } else {
                System.out.println("Verification failed: The files are different.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
