package com.sda.bogdan.advanced.enums.Examples;

import com.sda.bogdan.advanced.enums.Examples.Example;

public class Main {
    public static void main(String[] args) {

        for (Example example : Example.values()) {
            System.out.println(example.getOption() + " " + example.getDisplayValue());

        }
    }
}
