package com.allstate.speedyclaimsserverkn.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.id.IntegralDataTypeHolder;

import javax.persistence.*;

@Entity
@Table(name= "insurance_policy")
public class InsurancePolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;



    String policyNumber;
    @OneToOne
    Customer customerForename;

    public InsurancePolicy() {
    }

    public InsurancePolicy(Integer id, String policyNumber, Customer customerForename) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.customerForename = customerForename;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    @JsonIgnore


    public Customer getCustomerForename() {
        return customerForename;
    }

    public void setCustomerForename(Customer customerForename) {
        this.customerForename = customerForename;
    }
}
