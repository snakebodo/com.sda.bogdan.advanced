package com.sda.bogdan.advanced.inheritance.ex3;

public class Cat extends Animal {
    public Cat(String name, String race, int age) {
        super(name, race, age);
    }

    @Override
    public String toString() {
        return "Cat> " + yealdVoice();
    }
    @Override
    public String yealdVoice(){

        return "Miau";
    }

}