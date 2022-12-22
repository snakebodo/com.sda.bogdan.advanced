package com.sda.bogdan.advanced.exception.ex3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Create a Person class that will implement a Comparable interface.
 *          Person class should implement compareTo method,
 *          that will verify if one person is taller than another.
 */
public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("nicu", LocalDate.now(), 175);
        Person person2 = new Person("mihai", LocalDate.now(), 140);
        Person person3 = new Person("nae", LocalDate.now(), 186);

        System.out.println(person1.compareTo(person2));
        System.out.println(person2.compareTo(person3));

        List<Person> persons = new ArrayList<>();

            persons.add(person1);
            persons.add(person2);
            persons.add(person3);
    }
}
