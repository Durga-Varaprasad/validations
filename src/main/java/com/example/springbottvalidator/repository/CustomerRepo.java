package com.example.springbottvalidator.repository;

import com.example.springbottvalidator.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
