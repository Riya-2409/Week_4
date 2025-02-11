package com.mapinterface.invertmap;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        Map<Integer, List<String>> invertedMap = MapInverter.invertMap(originalMap);

        System.out.println(invertedMap);

    }
}
