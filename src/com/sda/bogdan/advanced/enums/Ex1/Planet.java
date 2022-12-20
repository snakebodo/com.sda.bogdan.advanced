package com.sda.bogdan.advanced.enums.Ex1;

public enum Planet {

    TERRA("Medium", "Terra", 23154),
    PLUTO("Small", "Pluto", 3453452),
    JUPITER("Huge", "Jupiter", 12980),
    SATURN("Huge", "Saturn", 34241235);


    private final String relativeSize;
    private final String displayValue;
    private final long distanceFromEarth;

    Planet(String relativeSize, String displayValue, long distanceFromEarth) {
        this.relativeSize = relativeSize;
        this.displayValue = displayValue;
        this.distanceFromEarth = distanceFromEarth;
    }

    public long getDistanceFromEarth() {
        return distanceFromEarth;
    }

    @Override
    public String toString() {
        return displayValue;
    }
}
