package com.kleberaluizio.customer;

import com.kleberaluizio.exception.ResourceNotFound;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indicates will be created a Bean of this class = SERVICE IS FOR SERVICE CLASSES
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
                .orElseThrow(() -> new ResourceNotFound(
                        "Customer with id [%s] not found".formatted(id)
                ));

    }
}
