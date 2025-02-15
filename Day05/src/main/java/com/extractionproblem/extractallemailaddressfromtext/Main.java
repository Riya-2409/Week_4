package com.extractionproblem.extractallemailaddressfromtext;

import java.util.List;

public class Main {
    public static void main(String args[]){
        String text = "Contact us at support@example.com and info@company.org";

        List<String> emails = EmailExtractor.extractEmails(text);

        emails.forEach(System.out::println);
    }
}
