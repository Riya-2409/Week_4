package com.reflection.basiclevel.classinspector;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the fully qualified class name: ");
        String className = scanner.nextLine();
        ClassInspector.inspectClass(className);
        scanner.close();
    }
}
