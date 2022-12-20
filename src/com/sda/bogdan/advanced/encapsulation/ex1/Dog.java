package com.sda.bogdan.advanced.encapsulation.ex1;

public class Dog {
    private String name;
    private String race;
    private int age;
    private double weight;
    private boolean gender;

    public Dog(String name, String race, int age, double weight, boolean gender) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.weight = weight;
        this.gender = gender;

    }

    public Dog(boolean gender, String race) {
        this("Dog", race, 0, 300, gender);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", gender=" + gender +
                '}';
    }
}
