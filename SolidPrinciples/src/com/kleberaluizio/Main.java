package com.kleberaluizio;

import com.kleberaluizio.solid.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        IAreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square( 10);
        Rectangle rectangle = new Rectangle(10, 15);
        Cube cube = new Cube(new Square(12));
        NoShape noShape = new NoShape();

        ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);

        List<Shape> shapes = List.of(
                rectangle,
                circle,
                square,
                cube);

        int sum = areaCalculator.sum(shapes);

//        System.out.println("Sum = " + sum);
        System.out.println(shapesPrinter.json(shapes));
        System.out.println(shapesPrinter.csv(shapes));

        System.out.println(cube.volume());

    }

    /*
    SINGLE RESPONSIBILITY
    Each class should have only one sole purpose, and not be filled
    with excessive functionality.

    OPEN CLOSED
    Classes should be open for extension,
    closed for modification.

    LISKOV SUBSTITUTION
    This means that every subclass or derived class should
    be substitutable for their base or parent class.

    INTERFACE SEGREGATION
    Interfaces should not force classes to implement
    what they can't do.
    Large interfaces should be divided into small ones.

    DEPENDENCY INVERSION
    High-level modules should not depend on low-level modules.
    Both should depend on abstractions.
     */
}
