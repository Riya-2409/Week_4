package com.rotateelement;

import java.util.*;

//Main class
public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int rotateBy = 2;


        ListRotator<Integer> rotator = new ListRotator<>();
        List<Integer> rotatedList = rotator.rotate(numbers, rotateBy);


        System.out.println("Original List: " + numbers);
        System.out.println("Rotated List: " + rotatedList);
    }

}
