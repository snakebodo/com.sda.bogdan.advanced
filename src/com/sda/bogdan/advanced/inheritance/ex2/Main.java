package com.sda.bogdan.advanced.inheritance.ex2;

/**
 * Create class Shape
 * a) Add fields, create constructor, getters and setters.
 * b) Create classes Rectangle and Circle. Both of them should inherit class Shape.
 * Which fields and methods are common?
 */
public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(6);
        circles[1] = new Circle(8);

        for (Circle circle : circles){
            System.out.println(circle);
            System.out.println(" ");
        }
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(6);
        shapes[1] = new Rectangle(5,9);

        for(Shape shape : shapes){
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Area: " + shape.getArea());
        }
    }

}
