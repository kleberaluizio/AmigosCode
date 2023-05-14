package com.kleberaluizio.solid;

public class ShapesPrinter {


    public static String json(int sum) {

        return "{shapesSum: %s}".formatted(sum);
    }

    public static String csv(int sum) {

        return "shapes_sum, %s".formatted(sum);
    }



}
