package com.junit.basic.testingstringutilitymethods;

public class Main {
    public static void main(String[] args) {
        System.out.println("Reverse: " + StringUtils.reverse("hello"));        // "olleh"
        System.out.println("Palindrome: " + StringUtils.isPalindrome("madam")); // true
        System.out.println("Uppercase: " + StringUtils.toUpperCase("hello"));  // "HELLO"
    }
}
