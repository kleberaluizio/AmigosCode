package com.kleberaluizio;

public class CreatingExceptions {
    public static void main(String[] args) {
        //Exception
        System.out.println(divide(10,2));

        try {
            System.out.println(divide(10.0, 0));
        }catch (MyCheckedException e){
            System.out.println(e.getMessage());
        }
    }
    public static double divide (int a, int b){
        if (b == 0){
            throw new MyUncheckedException("You cannot divide by 0!");
        }
        return a/b;
    }

    public static double divide (double a, double b) throws MyCheckedException{
        if (b == 0){
            throw new MyCheckedException("You cannot divide by 0!");
        }
        return a/b;
    }
}
