package com.sda.bogdan.advanced.InterFace.ex1;

/**
 * Create a interface 'Graphic' that encapsulates the fallowing method:
 * - draw()
 *
 * Based on this interface implement two classes:
 * - Line: which should print at System out a line
 *
 *            ` "------------"`
 *
 * - Square: which should print at System out a square:
 *
 *        `    --------
 *            |      |
 *            |      |
 *            --------`
 *
 * - Text: which should print at System out a text
 *
 * Create a Main class where you should initialize an Array of type Graphic with different implementations (Line, Square, Text).
 * Next, with a foreach call the draw() method on each of the array objects.
 */
public class Main {
    public static void main(String[] args) {

        Graphics[] graphics = new Graphics[5];
        graphics[0] = new Line();
        graphics[1] = new Square();
        graphics[2] = new Text("This value");

        drawElement(graphics);
    }

    public static void drawElement(Graphics[] graphics){
        for( Graphics graphic : graphics){
            graphic.draw();
        }
    }
}
