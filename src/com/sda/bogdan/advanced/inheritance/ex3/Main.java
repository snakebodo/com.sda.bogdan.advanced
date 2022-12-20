package com.sda.bogdan.advanced.inheritance.ex3;

/**
 * Create classes Dog and Cat.
 * 	a) Move common methods and fields to the class Animal.
 * 	b) Create method „yieldVoice”.
 * c) Create simple array of type Animal, that will contain one object of type Dog and one object of type Cat.
 * d) Using for-each loop show which animal gives what kind of voice. How to print a name of an object?
 */
public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Skippy", "Labrador", 2);
        animals[1] = new Cat("Tommy", "British-short-hair", 3);

        for( Animal animal : animals){
            System.out.println("\n" + animal);
        }
    }
}
