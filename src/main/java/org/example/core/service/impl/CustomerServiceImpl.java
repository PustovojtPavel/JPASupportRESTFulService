package org.example.core.service.impl;

import org.example.core.entry.Customer;
import org.example.core.repository.CustomerRepository;
import org.example.core.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    public List<Customer> getAll() {
        return repository.findAll();
    }
}
