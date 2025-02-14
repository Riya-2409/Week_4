package com.bytearraystream;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class ConvertImageToByteArrayTest {
    

    @Test
    void testWriteByteArrayToImage() throws IOException {
        String inputImagePath = "C:/Users/hp/Downloads/Teddy.jpg";  // Replace with a valid image path
        String outputImagePath = "C:/Users/hp/Downloads/Flower.jpg";

        byte[] imageBytes = ConvertImageToByteArray.convertImageToByteArray(inputImagePath);
        ConvertImageToByteArray.writeByteArrayToImage(imageBytes, outputImagePath);

        assertTrue(new java.io.File(outputImagePath).exists(), "Output file should exist");
    }

}

