package com.readuserinputfromconsole;

//Main Class
public class Main {

    //Main Method
    public static void main(String[] args) {
        // Create instances of UserInputReader and UserInfoSaver
        UserInputReader inputReader = new UserInputReader();
        SaveFile infoSaver = new SaveFile();

        // Get user input
        String name = inputReader.readInput("Enter your name: ");
        String age = inputReader.readInput("Enter your age: ");
        String favoriteLanguage = inputReader.readInput("Enter your favorite programming language: ");

        // Save the information to a file
        infoSaver.saveToFile(name, age, favoriteLanguage);
    }
}
