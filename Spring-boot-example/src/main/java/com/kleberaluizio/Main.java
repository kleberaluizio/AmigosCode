package com.kleberaluizio;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//319 lesson
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        /* SPRING CUIDA DESSAS INJECOES DE DEPENDENCIA
        CustomerService customerService = new CustomerService(new CustomerDataAccessService());
        CustomerController customerController = new CustomerController(customerService);
         */

        SpringApplication.run(Main.class, args);
    }

}
