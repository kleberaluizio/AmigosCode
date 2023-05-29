package com.kleberaluizio.customer;

import com.kleberaluizio.exception.RequestValidationException;
import com.kleberaluizio.exception.DuplicateResourceException;
import com.kleberaluizio.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indicates will be created a Bean of this class = SERVICE IS FOR SERVICE CLASSES
public class CustomerService {

    private final CustomerDao customerDao;

    public CustomerService(@Qualifier("jpa") CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public List<Customer> getAllCustomers() {
        return customerDao.selectAllCustomers();
    }

    public Customer getCustomer(Integer id) {
        return customerDao.selectCustomersById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Customer with id [%s] not found".formatted(id)
                ));

    }

    public void addCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        // Check if e-mail exists
        String email = customerRegistrationRequest.email();
        if (customerDao.existsPersonWithEmail(email)) {
            throw new DuplicateResourceException("Email already taken");
        }
        //add
        Customer customer = new Customer(
                customerRegistrationRequest.name(),
                customerRegistrationRequest.email(),
                customerRegistrationRequest.age()
        );

        customerDao.insertCustomer(customer);
    }

    public void deleteCustomerById(Integer id) {
        // Check if id exists
        if (!customerDao.existsPersonWithId(id)) {
            throw new ResourceNotFoundException("Customer with id [%s] not found".formatted(id));
        }
        //remove

        customerDao.deleteCustomerById(id);

    }

    public void updateCustomer(Integer customerId,
                               CustomerUpdateRequest updateRequest) {
        // Check if id exists
        Customer customer = getCustomer(customerId);

        boolean changes = false;

        //update
        if (updateRequest.name() != null && !updateRequest.name().equals(customer.getName())) {
            customer.setName(updateRequest.name());
            changes = true;
        }
        if (updateRequest.age() != null && !updateRequest.age().equals(customer.getAge())) {
            customer.setAge(updateRequest.age());
            changes = true;
        }

        if (updateRequest.email() != null && !updateRequest.email().equals(customer.getEmail())) {
            if (customerDao.existsPersonWithEmail(updateRequest.email())) {
                throw new DuplicateResourceException("Email already taken");
            }
            customer.setEmail(updateRequest.email());
            changes = true;
        }

        if(!changes) {
            throw new RequestValidationException("no data changes found");
        }

        customerDao.updateCustomer(customer);

    }
}