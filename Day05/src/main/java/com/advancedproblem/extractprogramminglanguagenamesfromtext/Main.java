package com.advancedproblem.extractprogramminglanguagenamesfromtext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet. Rust is also interesting.";

        List<String> extractedLanguages = ProgrammingLanguageExtractor.extractLanguages(text);

        // Print extracted programming languages
        System.out.println(String.join(", ", extractedLanguages));
    }
}

