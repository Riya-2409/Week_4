package com.mapinterface.wordfrequencycounter;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "D://calculator//file.txt/"; // Change this to your file path
        Map<String, Integer> wordCount = FrequencyCounter.countWordFrequency(filePath);

        System.out.println(wordCount);
    }
}
