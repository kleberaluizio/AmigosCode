package com.kleberaluizio;

//334 lesson

import com.kleberaluizio.customer.Customer;
import com.kleberaluizio.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
        SpringApplication.run(Main.class, args);

//        printBeans(applicationContext);
    }

    @Bean
    CommandLineRunner runner(CustomerRepository customerRepository){
        return args -> {
            Customer jamila = new Customer(
                    "Jamila",
                    "jamila@gmail.com",
                    19
            );

            Customer alex = new Customer(
                    "Alex",
                    "alex@gmail.com",
                    21
            );

            Customer nari = new Customer(
                    "Nari",
                    "nari@gmail.com",
                    28
            );

            List<Customer> customers = List.of(alex, jamila, nari);
            customerRepository.saveAll(customers);
        };
    }

}
