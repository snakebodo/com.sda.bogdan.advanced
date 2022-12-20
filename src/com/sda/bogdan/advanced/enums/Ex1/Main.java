package com.sda.bogdan.advanced.enums.Ex1;

/**
 * 1. Create enum Planet.
 * a) Override toString method. It should print relative size of a planet and it’s name.
 * 	E.g. „Huge Jupiter”, „Small Pluto”.
 * b)  Create distanceFromEarth method.
 * c) Verify both methods for multiple planets.
 */
public class Main {
    public static void main(String[] args) {

        for(Planet planet : Planet.values()){
            System.out.println("\n" + planet + "\n" + "Distance from Earth: " +planet.getDistanceFromEarth());
        }
    }

}
