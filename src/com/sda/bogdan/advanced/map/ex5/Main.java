package com.sda.bogdan.advanced.map.ex5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Write a program which count the number of each character occurring in a string.
 * Read the string from the command line.
 * Ex: {d=9, o=6, r=7, W=5}
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> letterCount = new HashMap<>();

        String input = "";
        System.out.println("Please insert your line");

        input = scanner.nextLine();

        input = input.trim();
        char[] letters = input.toCharArray();


        for (char character : letters) {

            if (!letterCount.containsKey(character)) {
                letterCount.put(character, 1);
            } else {
                int value = letterCount.get(character);
                value++;
                letterCount.put(character,value);
            }
        }

        System.out.println(letterCount);
    }
}
