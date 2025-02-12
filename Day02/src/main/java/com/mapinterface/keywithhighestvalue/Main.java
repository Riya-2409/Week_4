package com.mapinterface.keywithhighestvalue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 10, "B", 20, "C", 15);
        System.out.println(MaxKeyValue.findKeyWithMaxValue(map)); // Output: B

        Map<String, Double> doubleMap = Map.of("X", 2.5, "Y", 3.8, "Z", 3.7);
        System.out.println(MaxKeyValue.findKeyWithMaxValue(doubleMap)); // Output: Y

        Map<Integer, Long> longMap = Map.of(1, 100L, 2, 200L, 3, 150L);
        System.out.println(MaxKeyValue.findKeyWithMaxValue(longMap)); // Output: 2
    }
}
