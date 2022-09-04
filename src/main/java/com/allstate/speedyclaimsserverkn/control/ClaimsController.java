package com.allstate.speedyclaimsserverkn.control;


import com.allstate.speedyclaimsserverkn.domain.ClaimsTransaction;
import com.allstate.speedyclaimsserverkn.dtos.ClaimDTO;
import com.allstate.speedyclaimsserverkn.service.ClaimsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api/claim")
public class ClaimsController {


    ClaimsService claimsService;

    @Autowired
    public void setClaimsService(ClaimsService claimsService) {
        this.claimsService = claimsService;
    }

    @GetMapping()
    public List<ClaimsTransaction> getAll(@RequestParam(value="custSurname", required=false) String custSurname,
                                          @RequestParam(value="policyNo", required=false) String policyNo,
                                          @RequestParam(value="dateOfClaim", required=false) LocalDate dateOfClaim) {

        if (custSurname != null) {
            return claimsService.getAllTransactionsForCustSurname(custSurname);
        } else if (policyNo != null) {
            return claimsService.getAllTransactionsForPolicyNo(policyNo);
        } else if (dateOfClaim != null) {
            return claimsService.getAllTransactionsForDateOfClaim(dateOfClaim);
        } else {
            return claimsService.getAllTransactions();
        }
    }

    @GetMapping("/{id}")
    public ClaimsTransaction getById(@PathVariable("id") Integer id) {

        return claimsService.getTransactionById(id);
    }

    @GetMapping("/volume")
    public Map<String, String> getNumberOfClaims() {
        Integer volume = claimsService.countClaims();
        Map<String, String> results = new HashMap<>();
        results.put("volume", volume.toString());
        return results;
    }

    @PostMapping
    public ClaimsTransaction addTransaction(@RequestBody ClaimDTO newTransaction) {
        return claimsService.add(newTransaction);
    }

    @PutMapping("/{id}")
    public ClaimsTransaction updateTransaction(@PathVariable("id") Integer id,
                                                   @RequestBody Map<String, String> data) {
        return claimsService.updateClaimsTransaction(id, data);
    }


}
