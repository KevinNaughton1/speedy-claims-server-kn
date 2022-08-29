package com.allstate.speedyclaimsserverkn.data;

import com.allstate.speedyclaimsserverkn.domain.ClaimsTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ClaimsTransactionRepository extends JpaRepository<ClaimsTransaction, Integer> {

        public List<ClaimsTransaction> findAllByCustSurname(String custSurname);
        public List<ClaimsTransaction> findAllByPolicyNo(String policyNo);
        public List<ClaimsTransaction> findAllByDateOfClaim(LocalDate dateOfClaim);
}
