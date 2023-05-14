package com.kleberaluizio.solid;

import java.util.List;

public class AreaCalculator {

    public static int sum(List<Shape> shapes){
        int sum = 0;
        for(int i = 0; i < shapes.size(); i++){
            sum += shapes.get(i).area();
            }
        return sum;
    }
}
