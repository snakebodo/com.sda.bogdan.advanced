package com.sda.bogdan.advanced.exception.ex3;

import java.time.LocalDate;

public class Person implements Comparable<Person> {

    private String name;
    private LocalDate dateOfBirth;
    private double height;

    public Person(String name, LocalDate dateOfBirth, double height) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Person otherPerson) {
    /*    if(otherPerson.height < this.height);
            return -1;
    }else if (otherPerson.height == this.height){
        return 0;
    }else{
        return 1;
    }*/
        //return Integer.compare(this.height, otherPerson.height);
        return Integer.compare(otherPerson.height, this.height);
    }
}
