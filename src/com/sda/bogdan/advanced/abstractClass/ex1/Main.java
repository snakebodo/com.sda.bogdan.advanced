package com.sda.bogdan.advanced.abstractClass.ex1;

/**
 * a. Write an abstract class Shape
 * – Data members: numSides
 * – Constructor: initialize numSides
 * – Concrete method: get method for numSides
 * – Abstract methods: getArea(), getPerimeter()
 * b. Write a concrete subclass Rectangle
 * – Data members: width, height
 * c. Write a concrete subclass Triangle
 * – Data members: width, height
 */
public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(12.2, 40.3);
        Shape triangle = new Triangle(20.2, 30.5);

        triangle.compareShapeByPerimeter(rectangle);
        rectangle.compareShapeByPerimeter(triangle);
    }
}
