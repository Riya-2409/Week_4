package com.mapinterface.mergetwomaps;

import java.util.Map;
import java.util.HashMap;

public class MergeMaps {

    public static <K> Map<K, Integer> mergeMaps(Map<K, Integer> map1, Map<K, Integer> map2) {
        Map<K, Integer> result = new HashMap<>(map1); // Copy map1 to result

        // Merge map2 into result, summing values for duplicate keys
        map2.forEach((key, value) -> result.merge(key, value, Integer::sum));

        return result;
    }
}
