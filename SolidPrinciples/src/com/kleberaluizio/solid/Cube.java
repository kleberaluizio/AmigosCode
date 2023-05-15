package com.kleberaluizio.solid;

public class Cube implements Shape, ThreeDimensionalShape{

    private Square square;

    public Cube(Square square) {
        this.square = square;
    }

    @Override
    public double area() {
        return square.area() * 6;
    }

    @Override
    public double volume() {
        return Math.pow(square.getLength(),3);
    }
}
