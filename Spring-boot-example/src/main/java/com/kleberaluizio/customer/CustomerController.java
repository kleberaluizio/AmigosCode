package com.kleberaluizio.customer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // This customerController will be a Bean
@RequestMapping("api/v1/customers")
public class CustomerController { // This kind of classes take care of HTTPs requests

    private final CustomerService customerService;

//    @Autowired // This is no long needed
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("{customerId}")
    public Customer getCustomer(
            @PathVariable("customerId") Integer customerId){
        return customerService.getCustomer(customerId);

    }

    @PostMapping
    public void registerCustomer(
            @RequestBody  CustomerRegistrationRequest request){
        customerService.addCustomer(request);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer(
            @PathVariable("customerId") Integer customerId){
        customerService.deleteCustomerById(customerId);
    }

    @PutMapping("{customerId}")
    public void updateCustomer(
            @PathVariable("customerId") Integer customerId,
            @RequestBody CustomerUpdateRequest updateRequest){
        customerService.updateCustomer(customerId, updateRequest);
    }
}
