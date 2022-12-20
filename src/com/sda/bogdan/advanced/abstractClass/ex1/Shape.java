package com.sda.bogdan.advanced.abstractClass.ex1;

public abstract class Shape {
    private int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public abstract double getArea();
    public abstract double getpPerimeter();

    public void compareShapeByArea(Shape other){
        if(this.getArea() > other.getArea()){
            System.out.println("Shape with bigger area is : " + this);
        }else{
            System.out.println("Shape with bigger perimeter is : " + other);
        }
    }

    public void compareShapeByPerimeter(Shape other){
        if(this.getpPerimeter() > other.getpPerimeter()){
            System.out.println("Shape with bigger area is : " + this);
        }else{
            System.out.println("Shape with bigger area is : " + other);
        }
    }
    public int getNumSides() {
        return numSides;
    }

    @Override
    public String toString() {
        return "Shape> " +
                "numSides: " + numSides;
    }
}
