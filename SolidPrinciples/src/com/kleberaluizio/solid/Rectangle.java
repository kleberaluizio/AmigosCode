package com.kleberaluizio.solid;

public class Rectangle implements Shape{

    private final int length;
    private final int heigth;


    public Rectangle(int length, int heigth){
        this.length = length;
        this.heigth = heigth;
    }

    public int getLength() {
        return length;
    }
    public int getHeigth() {
        return heigth;
    }

    @Override
    public double area() {
        return getLength() * getHeigth();
    }
}
