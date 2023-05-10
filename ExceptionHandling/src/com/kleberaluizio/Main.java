package com.kleberaluizio;

public class Main {
    public static void main(String[] args) {
        //Exceptions

        try {
            int number = Integer.parseInt("1");
            System.out.println(number);

            for (int i =10; i >0; i--) {
                System.out.println(10 / i);
            }

        } catch (Exception e) { //Catch ALL Exception
            System.out.println("Catch all exception!");
            System.out.println(e.getMessage());

        } finally { // Everything inside is always executed!
            // It's manly used for cleanup purposes!
            System.out.println("Finally always run!");
        }
    }
}
