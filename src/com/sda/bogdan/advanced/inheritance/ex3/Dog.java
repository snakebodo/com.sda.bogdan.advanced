package com.sda.bogdan.advanced.inheritance.ex3;

public class Dog extends Animal {


    public Dog(String name, String race, int age) {
        super(name, race, age);
    }

    @Override
    public String toString() {
        return "Dog> " + yealdVoice();
    }
    @Override
    public String yealdVoice(){

        return "Woof";
    }
}
