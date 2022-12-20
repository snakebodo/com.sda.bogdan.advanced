package com.sda.bogdan.advanced.inheritance.ex1;

public class Person{
    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return   "\n" + name + " " + lastName;
    }
}
