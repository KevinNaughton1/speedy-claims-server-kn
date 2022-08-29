package com.allstate.speedyclaimsserverkn.service;

import com.allstate.speedyclaimsserverkn.data.ClaimsTransactionRepository;
import com.allstate.speedyclaimsserverkn.domain.ClaimsTransaction;
import com.allstate.speedyclaimsserverkn.exceptions.ClaimNotFoundException;
import com.allstate.speedyclaimsserverkn.exceptions.InvalidNewClaimsTransactionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ClaimsServiceImpl implements ClaimsService{

    @Autowired
    private ClaimsTransactionRepository claimsTransactionRepository;

    @Override
    public List<ClaimsTransaction> getAllTransactions() {

        return claimsTransactionRepository.findAll();

    }

    @Override
    public int countClaims() {
        return claimsTransactionRepository.findAll().size();
    }

    @Override
    public List<ClaimsTransaction> getAllTransactionsForCustSurname(String custSurname){
        return claimsTransactionRepository.findAllByCustSurname(custSurname);
    }

    @Override
    public List<ClaimsTransaction> getAllTransactionsForPolicyNo(String policyNo){
        return claimsTransactionRepository.findAllByPolicyNo(policyNo);
    }

    @Override
    public List<ClaimsTransaction> getAllTransactionsForDateOfClaim(LocalDate dateOfClaim){
        return claimsTransactionRepository.findAllByDateOfClaim(dateOfClaim);
    }

    @Override
    public ClaimsTransaction getTransactionById(Integer id) {
        Optional<ClaimsTransaction> optionalCT = claimsTransactionRepository.findById(id);
        if (optionalCT.isPresent()){
            return optionalCT.get();
        }
        throw new ClaimNotFoundException("There is no claims transaction with an id of " + id);
    }

    @Override
    public ClaimsTransaction add(ClaimsTransaction transaction) {

        if(transaction.getPolicyNo() == null || transaction.getClaimAmount() == null) {
            throw new InvalidNewClaimsTransactionException("Policy No and Claim Amount must be provided");
        }
        try {
            return claimsTransactionRepository.save(transaction);
        }
        catch (Exception e) {
            throw new InvalidNewClaimsTransactionException("Unable to save this transaction");
        }
    }

    @Override
    public ClaimsTransaction updateClaimsTransaction(Integer id, Map<String, String> data) {
        ClaimsTransaction transaction = getTransactionById(id);
        if (data.containsKey("dateOfIncident")) transaction.setDateOfIncident(LocalDate.parse(data.get("dateOfIncident")));
        if (data.containsKey("policyNo")) transaction.setPolicyNo(data.get("policyNo"));
        if (data.containsKey("title")) transaction.setTitle(data.get("title"));
        if (data.containsKey("custForename")) transaction.setCustForename(data.get("custForename"));
        if (data.containsKey("custSurname")) transaction.setCustSurname(data.get("custSurname"));
        if (data.containsKey("claimAmount")) transaction.setClaimAmount(Double.parseDouble(data.get("claimAmount")));
        if (data.containsKey("claimReason")) transaction.setClaimReason(data.get("claimReason"));
        if (data.containsKey("claimType")) transaction.setClaimReason(data.get("claimType"));
        return claimsTransactionRepository.save(transaction);
        /*   Should really include a Catch here in case update doesn't work */
    }
}
