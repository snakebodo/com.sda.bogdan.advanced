package com.sda.bogdan.advanced.map.ex1;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a map and display its result (data should be provided by the user - console):
 * - Names and surnames
 * - Names and ages.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, String> surnamesByName = new HashMap<>();
        surnamesByName.put("Vasile", "Grigore");
        surnamesByName.put("Vasile", "Ion");
        surnamesByName.put("Vasile2", "Dumitru");
        surnamesByName.put("Ion", "Igor");
        surnamesByName.put("Anton", "Igor");

        for (Map.Entry<String, String> entry : surnamesByName.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        if(!surnamesByName.containsKey("Vasile")){
            surnamesByName.put("Vasile", "Igor");
        }
        surnamesByName.putIfAbsent("Vasile", "Igor"); // same thing as if above at line 24

        System.out.println();
        System.out.println(surnamesByName.get("Vasile"));
        System.out.println(surnamesByName.get("Vasile264"));
        System.out.println(surnamesByName.get("Ion"));



    }
}