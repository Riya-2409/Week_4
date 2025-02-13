package com.mapinterface.keywithhighestvalue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 10, "B", 20, "C", 15);
        System.out.println(MaxKeyValue.findKeyWithMaxValue(map));
    }
}
