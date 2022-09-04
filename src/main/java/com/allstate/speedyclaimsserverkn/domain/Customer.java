package com.allstate.speedyclaimsserverkn.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String title;
    String customerForename;
    String customerSurname;
    @OneToMany(cascade =  CascadeType.ALL)
    List<InsurancePolicy> insurancePolicy;

    public Customer() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public Customer(Integer custId, String title, String custForename, String custSurname, List<InsurancePolicy> insurancePolicy) {
        this.id = custId;
        this.title = title;
        this.customerForename = custForename;
        this.customerSurname = custSurname;
        this.insurancePolicy = insurancePolicy;

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getCustomerForename() {
        return customerForename;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerForename(String customerForename) {
        this.customerForename = customerForename;
    }

    public List<InsurancePolicy> getInsurancePolicy() {
        return insurancePolicy;
    }

    public void setInsurancePolicy(List<InsurancePolicy> insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }
}
