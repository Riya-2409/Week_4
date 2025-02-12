package com.mapinterface.mergetwomaps;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        System.out.println(MergeMaps.mergeMaps(map1, map2));
    }
}
