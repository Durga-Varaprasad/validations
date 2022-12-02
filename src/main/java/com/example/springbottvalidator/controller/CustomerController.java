package com.example.springbottvalidator.controller;

import com.example.springbottvalidator.entity.Customer;
import com.example.springbottvalidator.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/save")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public String saveCustomer(@Valid @RequestBody Customer customer){
        return customerService.saveCustomerService(customer);
    }
}
