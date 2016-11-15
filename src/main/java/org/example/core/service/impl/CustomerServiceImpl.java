package org.example.core.service.impl;

import org.example.core.dao.CustomerDAO;
import org.example.core.entry.Customer;
import org.example.core.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    public List<Customer> getAll() {
        return customerDAO.findAll();
    }
}
