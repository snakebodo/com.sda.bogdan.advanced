package com.sda.bogdan.advanced.inputoutput.serializable.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * ##### IO Exercise 1
 * Create a file with a „lorem ipsum" paragraph within – it can be done by copy-pasting existing paragraph or generating it dynamically using Java library.
 * - Read that file.
 * - Count words.
 * - *Count special signs (like comma, dot, spaces).
 * - *Select one word and print it's number of occurrences.
 * <p>
 * ##### IO Exercise 2
 * Write a Java program to find the longest word in a text file.
 * <p>
 * ##### IO Exercise 3
 * - Write a Java program to check if a file or directory specified by pathname exists or not.
 * - Write a Java program to check if a file or directory has read and write permission.
 * - Write a Java program to check if given pathname is a directory or a file
 * - Write a Java program to read a file content line by line
 * - Write a java program to read a file line by line and store it into a variable.
 * - Write a Java program to append text to an existing file.
 * - Write a Java program to read first 3 lines from a file.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("N:\\SDA\\com.sda.bogdan.advanced\\file\\file.txt");

        Map<String, Integer> occurencesOfWords = new HashMap<>();
        try (BufferedReader bufferReader = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = bufferReader.readLine()) != null) {
                for (String word : line.split(" ")) {
                    if (!occurencesOfWords.containsKey(word)) {
                        occurencesOfWords.put(word, 1);
                    } else {
                        int value = occurencesOfWords.get(word);
                        occurencesOfWords.put(word, value + 1);
                    }
                }
            }
        }
        System.out.println(occurencesOfWords);

        occucerrencesByWordCount(occurencesOfWords);
    }

    private static void occucerrencesByWordCount(Map<String, Integer> occurencesOfWords) {
        System.out.println(occurencesOfWords.get("accident,") != null ? occurencesOfWords.get("accident,") : 0);
    }
}
