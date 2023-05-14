package com.kleberaluizio;

import com.kleberaluizio.solid.AreaCalculator;
import com.kleberaluizio.solid.Circle;
import com.kleberaluizio.solid.ShapesPrinter;
import com.kleberaluizio.solid.Square;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square( 10);
        List<Object> shapes = List.of(circle, square);

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

     */
}
