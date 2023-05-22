package com.kleberaluizio;

// 295 lesso n

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//MY FIRST API WITH SPRING BOOT

@SpringBootApplication
@RestController // make sure any method in this class
                // who has ...Mapping will be exposed
                // an clients can call
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public GreetResponse greet(){

        GreetResponse response = new GreetResponse(
                "Hello!",
                List.of("Java","Golang","javascript"),
                new Person("Alex",28,30_000)
        );
        return response;

    }

    record Person(String name, int age, double savings){}

    record GreetResponse(
            String greet,
            List<String> favProgrammingLanguage,
            Person person
    ){}
//    @GetMapping("/greet")
//    public String greet(){
//        return "Hello World";
//    }

}
