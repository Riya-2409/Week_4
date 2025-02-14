package com.checkedexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Create the class name IOExceptionExample
public class IOExceptionExample {

    //Main Method
    public static void checkedException(){
        //Define the path
        String fileName = "D:/riya/data.txt";
        //Use try-catch block to handle exception
        try{
            //BufferReader Object
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch(FileNotFoundException e){
            System.out.println("File not found"+e.getMessage());
        } catch(IOException e) {
            System.out.println("An error occurred while reading the file"+e.getMessage());
        }
    }
}
