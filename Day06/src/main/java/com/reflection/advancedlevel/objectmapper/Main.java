package com.reflection.advancedlevel.objectmapper;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Alice");
        properties.put("age", 25);
        properties.put("isStudent", false);
        properties.put("extraField", "ignored"); // This field does not exist in Person

        Person person = ObjectMapper.toObject(Person.class, properties);
        System.out.println(person);
    }
}

