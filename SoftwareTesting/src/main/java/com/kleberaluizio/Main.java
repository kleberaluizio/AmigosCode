package com.kleberaluizio;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker fake = new Faker();
        System.out.println(fake.name().fullName());
        System.out.println(fake.animal().name());

    }

}
