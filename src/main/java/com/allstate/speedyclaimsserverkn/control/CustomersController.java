package com.allstate.speedyclaimsserverkn.control;

import com.allstate.speedyclaimsserverkn.domain.Customer;
import com.allstate.speedyclaimsserverkn.dtos.CustomerDTO;
import com.allstate.speedyclaimsserverkn.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/customer")
public class CustomersController {

    @Autowired
    private CustomerService customerService;

    @GetMapping()
    public List<Customer> getAll(){

        return customerService.getAll();
    }

    @PostMapping
    public Customer newCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.addCustomer(customerDTO);
    }
}
