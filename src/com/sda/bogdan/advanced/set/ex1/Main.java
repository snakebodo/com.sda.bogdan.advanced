package com.sda.bogdan.advanced.set.ex1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Create a set consisting of colors - given from the user
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> colours = new HashSet<>();

        String newColour = "";

        while(!newColour.equals("Exit")){
            System.out.println("Please insert a new colour");
            newColour = scanner.nextLine();
            newColour = newColour.trim();

            if(!newColour.isBlank() && !newColour.equals("Exit")){
                colours.add(newColour);
                System.out.println(colours);
            }
        }

    }
}
