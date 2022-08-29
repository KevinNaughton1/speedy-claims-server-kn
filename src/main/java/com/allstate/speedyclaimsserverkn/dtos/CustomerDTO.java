package com.allstate.speedyclaimsserverkn.dtos;

import com.allstate.speedyclaimsserverkn.domain.Customer;

import java.util.ArrayList;

public class CustomerDTO {

    private String title;
    private String custForename;
    private String custSurname;


    public CustomerDTO () {

    }

    public CustomerDTO(Customer customer) {
        this.title = customer.getTitle();
        this.custForename = customer.getCustomerForename();
        this.custSurname = customer.getCustomerSurname();

    }

    public Customer toCustomer() {
        return new Customer(null, title, custForename, custSurname, new ArrayList<>());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCustForename() {
        return custForename;
    }

    public void setCustForename(String custForename) {
        this.custForename = custForename;
    }

    public String getCustSurname() {
        return custSurname;
    }

    public void setCustSurname(String custSurname) {
        this.custSurname = custSurname;
    }
}
