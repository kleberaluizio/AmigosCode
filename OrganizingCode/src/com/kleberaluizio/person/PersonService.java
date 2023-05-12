package com.kleberaluizio.person;

public class PersonService {

    public int addPerson(Person person){

        // Performs some business logic
        if (person.getFirstName().isBlank()){
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        // Add person to dataBase
        return 1;
    }
}
