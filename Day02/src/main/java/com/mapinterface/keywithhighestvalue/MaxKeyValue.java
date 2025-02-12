package com.mapinterface.keywithhighestvalue;

import java.util.Map;
import java.util.Collections;

public class MaxKeyValue {

    public static <K, V extends Comparable<V>> K findKeyWithMaxValue(Map<K, V> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}