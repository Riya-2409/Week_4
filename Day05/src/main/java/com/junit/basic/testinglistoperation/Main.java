package com.junit.basic.testinglistoperation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new java.util.ArrayList<>();

        ListManger.addElement(numbers, 10);
        ListManger.addElement(numbers, 20);
        System.out.println("List after adding: " + numbers); // [10, 20]

        ListManger.removeElement(numbers, 10);
        System.out.println("List after removing 10: " + numbers); // [20]

        System.out.println("Size of list: " + ListManger.getSize(numbers)); // 1
    }
}
