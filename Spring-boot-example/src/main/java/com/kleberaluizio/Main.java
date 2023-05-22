package com.kleberaluizio;

// 295 lesson
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String greet(){
        return "Hello World";
    }

}
