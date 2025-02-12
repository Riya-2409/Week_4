package com.mapinterface.groupobjectsbyprojects;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Grouping {
    public static <T, K> Map<K, List<T>> groupByProperty(List<T> list, Function<T, K> classifier) {
        return list.stream().collect(Collectors.groupingBy(classifier));
    }
}

