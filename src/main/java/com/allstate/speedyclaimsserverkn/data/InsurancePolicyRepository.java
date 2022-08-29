package com.allstate.speedyclaimsserverkn.data;

import com.allstate.speedyclaimsserverkn.domain.InsurancePolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsurancePolicyRepository extends JpaRepository <InsurancePolicy, Integer> {
}


