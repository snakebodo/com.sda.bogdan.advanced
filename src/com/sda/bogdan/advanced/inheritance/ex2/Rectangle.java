package com.sda.bogdan.advanced.inheritance.ex2;

public class Rectangle extends Shape{

    private double length;
    private double width;


    public Rectangle( double length, double width) {
        super(length * width, 2 * (length + width));
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle> " +
                "length : " + length +
                "\nwidth: " + width +
                super.toString();
    }
}
