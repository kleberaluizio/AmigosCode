package com.kleberaluizio;

// 310 lesson

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//MY FIRST API WITH SPRING BOOT

@SpringBootApplication
@RestController // make sure any method in this class
                // who has ...Mapping will be exposed
                // an clients can call
public class Main {

    //db
    private static List<Customer> curstomers;

    static{
        curstomers = new ArrayList<>();

        Customer jamila = new Customer(
                2,
                "Jamila",
                "jamila@gmail.com",
                19);

        Customer alex = new Customer(
                1,
                "Alex",
                "alex@gmail.com",
                21);

        curstomers.add(alex);
        curstomers.add(jamila);

    }
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }


    /*@RequestMapping(
            path = "api/v1/customer",
            method = RequestMethod.GET
    )*/
    @GetMapping("api/v1/customers")
    public List<Customer> getCurstomers(){
        return curstomers;
    }

    @GetMapping("api/v1/customers/{customerId}")
    public Customer getCurstomer(
            @PathVariable("customerId") Integer customerId){
        Customer customer1 = curstomers.stream().
                filter(customer -> customer.id.equals(customerId))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Customer with id [%s] not found".formatted(customerId)));

        return customer1;
    }

    static class Customer{
        private Integer id;
        private String name;
        private String email;
        private Integer age;

        public Customer(){}

        public Customer(Integer id, String name, String email, Integer age) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.age = age;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Customer customer = (Customer) o;
            return Objects.equals(id, customer.id) && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(age, customer.age);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, email, age);
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

//    @GetMapping("/greet")
//    public GreetResponse greet(
//            @RequestParam(value = "name", required = false) String name){
//
//        String greetMessage = name==null || name.isBlank()?"Hello":"Hello " + name;
//
//        GreetResponse response = new GreetResponse(
//                greetMessage,
//                List.of("Java","Golang","javascript"),
//                new Person("Alex",28,30_000)
//        );
//        return response;
//
//    }
//
//    record Person(String name, int age, double savings){}
//
//    record GreetResponse(
//            String greet,
//            List<String> favProgrammingLanguage,
//            Person person
//    ){}
}
