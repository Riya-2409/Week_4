package com.advancedproblem.extractprogramminglanguagenamesfromtext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgrammingLanguageExtractor {

    public static List<String> extractLanguages(String text) {
        List<String> languages = new ArrayList<>();
        List<String> knownLanguages = Arrays.asList("Java", "Python", "JavaScript", "C", "C++", "C#", "Go", "Ruby", "Swift", "Kotlin", "PHP", "Rust", "TypeScript", "Perl", "Scala", "Haskell");

        for (String lang : knownLanguages) {
            String regex = "\\b" + lang + "\\b";  // Match whole words only
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()) {
                languages.add(lang);
            }
        }

        return languages;
    }

}
