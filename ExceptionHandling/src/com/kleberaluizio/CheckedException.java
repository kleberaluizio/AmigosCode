package com.kleberaluizio;

import java.io.File;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        //Checked Exception
        try {
            File file = new File("src/foo.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e ){
            System.out.println(e.getMessage());
        }

        double division = divide(4,0);
        System.out.println(division);
    }

    public static double divide(int a, int b) throws IllegalArgumentException{
        if(b == 0){
            throw new IllegalArgumentException("Cannot divide by ZERO!");
        }
        return a/b;
    }
}
