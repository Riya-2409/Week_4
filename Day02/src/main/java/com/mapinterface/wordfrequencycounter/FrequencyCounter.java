package com.mapinterface.wordfrequencycounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FrequencyCounter {
    public static Map<String, Integer> countWordFrequency(String filePath) {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Convert to lowercase and remove punctuation
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return wordFrequencyMap;
    }
}
