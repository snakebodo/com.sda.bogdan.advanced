package com.sda.bogdan.advanced.lists.ex2;

import java.util.*;

/**
 * - Write a Java program to create a new array list, add some colors (string) and print out the collection.DONE
 * - Write a Java program to iterate through all elements in a array list.DONE
 * - Write a Java program to insert an element into the array list at the first position.DONE
 * - Write a Java program to retrieve an element (at a specified index) from a given array list.DONE
 * - Write a Java program to update specific array element by given element.DONE
 * - Write a Java program to remove the third element from a array list.DONE
 * - Write a Java program to search an element in a array list.DONE
 * - Write a Java program to sort a given array list.
 * - Write a Java program to copy one array list into another.
 * - Write a Java program to shuffle elements in a array list.
 * - Write a Java program to reverse elements in a array list.
 * - Write a Java program to extract a portion of a array list.
 * - Write a Java program of swap two elements in an array list.
 * - Write a Java program to join two array lists.
 * - Write a Java program to clone an array list to another array list.
 * - Write a Java program to empty an array list.DONE
 * - Write a Java program to test an array list is empty or not.DONE
 */

public class Main {
    public static void main(String[] args) {

        List<String> colours = new ArrayList<>();
        addColours(colours, "blue");
        addColours(colours, "red");
        addColours(colours, "yellow");
        addColours(colours, "black");
        addColours(colours, "white");

        displayPaintList(colours);

        System.out.println("");
        iterate(colours);

        addElementToPos0(colours, "brown");
        System.out.println();
        displayPaintList(colours);

        System.out.println("\n" + retrieveAnElement(colours, 3));

        updateAnElement(colours, 5, "purple");
        displayPaintList(colours);

        removeAnElement(colours, 2);
        displayPaintList(colours);

        System.out.println("\nfind element in list");
        System.out.println(findAnElement(colours, "creme"));

        System.out.println("\nclearing list");
        clearList(colours);

        System.out.println();
        System.out.println(listIsEmpty(colours));
    }

    public static void addColours(List<String> colourList, String item) {
        if (!colourList.contains(item)) {
            colourList.add(item);
        }
    }

    public static void displayPaintList(List<String> colours) {
        System.out.println("Your paint list: ");

        for (String item : colours) {
            System.out.println("- " + item);
        }
    }

    public static void iterate(List<String> colours) {
        for (int i = 0; i < colours.size(); i++) {
            System.out.println("- " + colours.get(i));
        }
    }

    public static void addElementToPos0(List<String> colours, String element) {
        colours.add(0, element);
    }

    public static String retrieveAnElement(List<String> colours, int n) {
        String element = "";
        if (n >= 0 && n < colours.size()) {
            element = colours.get(n);
        }
        return element;
    }

    public static String updateAnElement(List<String> colours, int n, String item) {
        String element = "";
        if (n >= 0 && n < colours.size()) {
            element = colours.set(n, item);
        }
        return element;
    }

    public static void removeAnElement(List<String> colours, int i) {
        colours.remove(i);
    }

    public static String findAnElement(List<String> colours, String element) {
        String found = "";
        for (String item : colours) {
            if (item.equals(element)) {
                found = item;
            }
        }
        if (found.isBlank()) {
            return "Element not found";
        } else {
            return found;
        }
    }

    public static void clearList(List<String> colours) {
        colours.clear();
    }

    public static boolean listIsEmpty(List<String> colours) {
        if (colours.isEmpty()) {
            return true;
        }
        return false;
    }

    public static List<String> sortedList(List<String> colours) {
        Collections.sort(colours);
        return colours;
        /*colours.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        return colours;*/
    }

    public static List<String> copyListToAnotherList(List<String> colours) {
        List<String> colours2 = new ArrayList<>();
        for (String items : colours) {
            colours2.add(items);
        }
        return colours2;
    }

    public static void suffleList(List<String> colours) {
        Collections.shuffle(colours);
    }

    public static List<String> extractPartOfList(List<String> colours, int start, int end) {
        if (start >= 0 && start < colours.size() && end >= 0 && end < colours.size() && start < end) {
            return colours.subList(start, end);
        }
        return new ArrayList<>();
    }
}