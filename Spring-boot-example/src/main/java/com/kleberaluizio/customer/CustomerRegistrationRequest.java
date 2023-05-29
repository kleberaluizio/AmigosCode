package com.kleberaluizio.customer;

public record CustomerRegistrationRequest (
        String name,
        String email,
        Integer age
){

}
