package com.sda.bogdan.advanced.inputoutput.newio.ex1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Write a Java program to find the longest word in a text file.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("N:\\SDA\\com.sda.bogdan.advanced\\file\\file.txt");

        List<String> lines = Files.readAllLines(path);

        String longestWord = "";
        for(String line : lines){
            for (String word : line.split(" ")) {
                if(word.length() > longestWord.length()){
                    longestWord = word;
                }
            }
        }
        System.out.println(longestWord);
    }
}
