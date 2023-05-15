package com.kleberaluizio;

import com.kleberaluizio.solid.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square( 10);
        Rectangle rectangle = new Rectangle(10, 15);
        Cube cube = new Cube(new Square(12));
        NoShape noShape = new NoShape();

        List<Shape> shapes = List.of(
                rectangle,
                circle,
                square,
                cube);

        int sum = AreaCalculator.sum(shapes);

//        System.out.println("Sum = " + sum);
        System.out.println(ShapesPrinter.json(sum));
        System.out.println(ShapesPrinter.csv(sum));

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

     */
}
