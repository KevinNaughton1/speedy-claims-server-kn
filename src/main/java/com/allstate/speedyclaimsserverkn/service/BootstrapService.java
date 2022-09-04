package com.allstate.speedyclaimsserverkn.service;

import com.allstate.speedyclaimsserverkn.data.CustomerRepository;
import com.allstate.speedyclaimsserverkn.data.InsurancePolicyRepository;
import com.allstate.speedyclaimsserverkn.domain.Customer;
import com.allstate.speedyclaimsserverkn.domain.InsurancePolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class BootstrapService {

    @Autowired
    InsurancePolicyRepository insurancePolicyRepository;

    @Autowired
    CustomerRepository customerRepository;

    @PostConstruct
    public void initializeData() {

        if (customerRepository.findAll().size() == 0) {

            Customer customer1 = new Customer(null,"Mr", "Chris","Morris",
                    null);
            Customer customer2 = new Customer(null, "Mr","Mo","Salah",
                    null);

            InsurancePolicy policy1 = new InsurancePolicy(null, "A1234", customer1);
            InsurancePolicy policy2 = new InsurancePolicy(null, "B2345", customer1);
    //        InsurancePolicy policy3 = new InsurancePolicy(null, "C1234", customer2);
    //        InsurancePolicy policy4 = new InsurancePolicy(null, "D9874", customer2);

            List<InsurancePolicy> ipl1 = new ArrayList<>();
            ipl1.add(policy1);
            ipl1.add(policy2);
            customer1.setInsurancePolicy(ipl1);

            List<InsurancePolicy> ipl2 = new ArrayList<>();
            //ipl2.add(policy3);
            //ipl2.add(policy4);
            customer2.setInsurancePolicy(ipl2);

            customerRepository.save(customer1);
            customerRepository.save(customer2);
        }
    }
}
