package com.advancedproblem.extractcurrencyvaluefromtext;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyExtractor {

    public static List<String> extractCurrencyValues(String text) {
        List<String> currencyValues = new ArrayList<>();
        String regex = "\\$?\\d+(\\.\\d{2})?"; // Matches optional $ sign, numbers, and decimal values

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }

        return currencyValues;
    }
}
