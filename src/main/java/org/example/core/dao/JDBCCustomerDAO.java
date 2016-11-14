package org.example.core.dao;

import org.example.core.entry.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

@Component
public class JDBCCustomerDAO implements CustomerDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String SQL_GET_ALL_CUSTOMERS = "selet * from test.customer";

    public List<Customer> findAll() {

        return jdbcTemplate.query(SQL_GET_ALL_CUSTOMERS,
                new RowMapper<Customer>() {
                    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Customer customer = new Customer();
                        customer.setId(UUID.fromString(rs.getString("id")));
                        customer.setName(rs.getString("name"));
                        return null;
                    }
                });
    }

}
