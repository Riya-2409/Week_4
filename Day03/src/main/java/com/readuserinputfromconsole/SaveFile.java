package com.readuserinputfromconsole;

import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {

    // Create the method name saveToFile
    public void saveToFile(String name, String age, String favoriteLanguage) {
        // Use try-catch block
        try (FileWriter writer = new FileWriter("D:/calculator/file.txt")) {  // Corrected constructor and braces
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + favoriteLanguage + "\n");
            System.out.println("User information has been saved to 'file.txt'.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }
    }
}
