package org.example.core.dao;

import org.example.core.entry.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> findAll();
}
