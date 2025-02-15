package com.advancedproblem.findrepeatingwordsinsentence;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWordsFinder {

    public static Set<String> findRepeatingWords(String text) {
        Set<String> repeatingWords = new HashSet<>();
        Map<String, Integer> wordCount = new HashMap<>();

        // Regex to match words (case-insensitive)
        String regex = "\\b\\w+\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String word = matcher.group().toLowerCase(); // Convert to lowercase for case-insensitive matching
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Collect words that appear more than once
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                repeatingWords.add(entry.getKey());
            }
        }

        return repeatingWords;
    }
}
