package com.allstate.speedyclaimsserverkn.data;

import com.allstate.speedyclaimsserverkn.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    public Customer findBycustomerForename(String name);

}
