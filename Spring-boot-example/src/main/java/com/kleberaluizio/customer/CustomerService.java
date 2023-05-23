package com.kleberaluizio.customer;

import java.util.List;

public class CustomerService {

    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public List<Customer> getAllCustomers(){
        return customerDao.selectAllCustomers();
    }

    public Customer getCustomer(Integer id){
        return customerDao.selectCustomersById(id)
                .orElseThrow(() -> new IllegalArgumentException("Customer with id [%s] not found".formatted(id)
                ));

    }
}
