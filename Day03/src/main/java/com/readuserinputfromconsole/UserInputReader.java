package com.readuserinputfromconsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Create the class name UserInputReader
class UserInputReader {

    //Create the class name readInput
    public String readInput(String prompt) {
        //BufferReader Object
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        //Use try-catch block
        try {
            System.out.print(prompt);
            input = reader.readLine();
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();
        }

        return input;
    }


}
