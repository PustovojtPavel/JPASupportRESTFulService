package org.example.web.rest;

import org.example.core.entry.Customer;
import org.example.core.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/get")
@Produces(MediaType.APPLICATION_JSON + GetCustomerController.CHARSET_UTF8)
@Component
public class GetCustomerController {

    private static final Logger log = LoggerFactory.getLogger(GetCustomerController.class);
    final static String CHARSET_UTF8 = ";charset=UTF-8";

    @Autowired
    private CustomerService customerSrv;

    @POST
    public List<Customer> getAllCustomer() {
        List<Customer> result = customerSrv.getAll();
        return result;
    }
}
