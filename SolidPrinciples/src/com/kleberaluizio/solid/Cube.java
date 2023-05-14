package com.kleberaluizio.solid;

public class Cube implements Shape{

    private Square square;

    public Cube(Square square) {
        this.square = square;
    }

    @Override
    public double area() {
        return square.area() * 6;
    }
}
