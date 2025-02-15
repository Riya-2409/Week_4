package com.extractionproblem.extractallemailaddressfromtext;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {

    public static List<String> extractEmails(String text){
        List<String>emails = new ArrayList();
        String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            emails.add(matcher.group());
        }
        return emails;
    }
}
