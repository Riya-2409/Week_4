package com.junit.basic.testingparameterizedtests;

public class Main {

    public static void main(String[] args) {
        int[] testNumbers = {2, 4, 6, 7, 9};

        for (int num : testNumbers) {
            System.out.println("Is " + num + " even? " + NumberUtils.isEven(num));
        }
    }
}
