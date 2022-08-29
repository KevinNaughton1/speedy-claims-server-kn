package com.allstate.speedyclaimsserverkn.service;

import com.allstate.speedyclaimsserverkn.domain.Customer;
import com.allstate.speedyclaimsserverkn.dtos.CustomerDTO;

import java.util.List;

public interface CustomerService {

    public List<Customer> getAll();

    public Customer addCustomer(CustomerDTO newCustomer);


}
