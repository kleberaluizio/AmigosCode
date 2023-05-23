package com.kleberaluizio.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository // Indicates will be created a Bean of this class = REPOSITORY is FOR DAO
public class CustomerDataAccessService implements CustomerDao {
    //db
    private static List<Customer> customers;

    static{
        customers = new ArrayList<>();

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

        customers.add(alex);
        customers.add(jamila);

    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomersById(Integer customerId) {
        return customers.stream().
                filter(customer -> customer.getId().equals(customerId))
                .findFirst();
    }
}
