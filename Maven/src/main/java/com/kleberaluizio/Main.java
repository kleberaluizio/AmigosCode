package com.kleberaluizio;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.dog().age());
        System.out.println(faker.address().city());
    }
}
