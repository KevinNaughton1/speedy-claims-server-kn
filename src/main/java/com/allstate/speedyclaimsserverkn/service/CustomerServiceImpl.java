package com.allstate.speedyclaimsserverkn.service;

import com.allstate.speedyclaimsserverkn.data.CustomerRepository;
import com.allstate.speedyclaimsserverkn.domain.Customer;
import com.allstate.speedyclaimsserverkn.dtos.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer addCustomer(CustomerDTO newCustomer) {
        return null;
    }
}
