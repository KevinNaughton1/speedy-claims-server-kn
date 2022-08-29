package com.allstate.speedyclaimsserverkn.service;

import com.allstate.speedyclaimsserverkn.domain.ClaimsTransaction;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface ClaimsService {

    public List<ClaimsTransaction> getAllTransactions();
    public int countClaims();
    public List<ClaimsTransaction> getAllTransactionsForCustSurname(String custSurname);
    public List<ClaimsTransaction> getAllTransactionsForPolicyNo(String policyNo);
    public List<ClaimsTransaction> getAllTransactionsForDateOfClaim(LocalDate dateOfClaim);
    public ClaimsTransaction getTransactionById(Integer id);
    public ClaimsTransaction add(ClaimsTransaction transaction);
    public ClaimsTransaction updateClaimsTransaction(Integer id, Map<String, String> data);
}

