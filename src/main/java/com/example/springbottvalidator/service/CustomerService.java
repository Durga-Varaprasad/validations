package com.example.springbottvalidator.service;

import com.example.springbottvalidator.entity.Customer;
import com.example.springbottvalidator.repository.CustomerRepo;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public String saveCustomerService(Customer customer) {
        Customer save = customerRepo.save(customer);
        return "Customer Registration is successfully";
    }
}
