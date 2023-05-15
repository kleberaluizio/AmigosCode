package com.kleberaluizio.solid;

public class Rectangle implements Shape{

    private final int length;
    private final int height;


    public Rectangle(int length, int height){
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }
    public int getHeight() {
        return height;
    }

    @Override
    public double area() {
        return getLength() * getHeight();
    }
}
