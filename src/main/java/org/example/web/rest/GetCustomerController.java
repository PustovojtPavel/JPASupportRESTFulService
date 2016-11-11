package org.example.web.rest;

import org.example.core.entry.Customer;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/get")
@Produces(MediaType.APPLICATION_JSON + GetCustomerController.CHARSET_UTF8)
public class GetCustomerController {

    final static String CHARSET_UTF8 = ";charset=UTF-8";

    @POST
    public List<Customer> getCustomer() {

       return new ArrayList<Customer>();

    }
}
