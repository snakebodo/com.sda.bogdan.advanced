package com.sda.bogdan.advanced.exception.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write an application that will read the input and print back value that user provided,
 * use try-catch statements to parse the input, e.g.
 * <p>
 * - I/O:
 * Input: 10
 * Output: int -> 10
 * Input: 10.0
 * Output: double -> 10.0
 * Input: „Hello!"
 * Output: „Hey! That's not a value! Try once more."
 */
public class Main {
    public static void main(String[] args) {
        parseInput();
    }

    private static void parseInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a value");
        String inputString = scanner.next();

        try {
            int n = Integer.parseInt(inputString);
            System.out.println("int " + n);
        } catch (NumberFormatException e) {
            try {
                double n = Double.parseDouble(inputString);
                System.out.println("double " + n);
            } catch (NumberFormatException exception) {
                System.out.println("Hey! That's not a value! Try once more.");
            }
        }
    }
}
