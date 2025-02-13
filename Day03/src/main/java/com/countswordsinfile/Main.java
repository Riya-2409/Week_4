package com.countswordsinfile;

public class Main {

    public static void main(String[] args) {
        // Path to the text file
        String filePath = "D:/calculator/file.txt";

        // Call the method to count words and display the top 5 most frequent words
        WordsFrequency.countWordsInFile(filePath);
    }

}
