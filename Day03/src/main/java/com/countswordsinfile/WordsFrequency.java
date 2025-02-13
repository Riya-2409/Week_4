package com.countswordsinfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordsFrequency {

    public static void countWordsInFile(String filePath) {
        BufferedReader reader = null;
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        try {
            // Create BufferedReader to read the file line by line
            reader = new BufferedReader(new FileReader(filePath));
            String line;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Split the line into words (use regular expression for splitting by non-word characters)
                String[] words = line.split("\\W+");

                // Count the occurrences of each word
                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.toLowerCase();  // Case-insensitive counting
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Sort the words based on frequency using a PriorityQueue (max heap)
            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
            sortedWords.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue()); // Sort in descending order of frequency

            // Display the top 5 most frequent words
            System.out.println("Top 5 most frequent words:");
            for (int i = 0; i < Math.min(5, sortedWords.size()); i++) {
                Map.Entry<String, Integer> entry = sortedWords.get(i);
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // Close the BufferedReader
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
