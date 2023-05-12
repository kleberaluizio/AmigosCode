package com.kleberaluizio.person;

import com.kleberaluizio.cat.Cat;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private Cat[] cats;

    public Person(String firstName,
                  String lastName,
                  int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

}
