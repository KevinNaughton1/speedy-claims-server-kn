package com.allstate.speedyclaimsserverkn.dtos;

import com.allstate.speedyclaimsserverkn.domain.ClaimsTransaction;

import java.time.LocalDate;

public class ClaimDTO {
    private LocalDate dateOfIncident;
    private String policyNo;
    private String title;
    private String custForename;
    private String custSurname;
    private Double claimAmount;
    private String claimReason;
    private String claimType;
    private String petName;
    private String carRegistration;
    private String houseAddress;

    public ClaimDTO() {
    }

    public ClaimDTO(ClaimsTransaction cct) {
        this.dateOfIncident = cct.getDateOfIncident();
        this.policyNo = cct.getPolicyNo();
        this.title = cct.getTitle();
        this.custForename = cct.getCustForename();
        this.custSurname = cct.getCustSurname();
        this.claimAmount = cct.getClaimAmount();
        this.claimReason = cct.getClaimReason();
        this.claimType = cct.getClaimType();
        this.petName = cct.getPetName();
        this.carRegistration = cct.getCarRegistration();
        this.houseAddress = cct.getHouseAddress();
    }

    public ClaimsTransaction toClaimsTransaction() {

        ClaimsTransaction cct = new ClaimsTransaction(null, LocalDate.now(), dateOfIncident, policyNo,
                title, custForename, custSurname, claimAmount, claimReason, claimType,
                petName, carRegistration, houseAddress );
        return cct;
        //Day13 - 1:44:00 - reference if conditional setting of pet/car/house fields required.
    }

    public LocalDate getDateOfIncident() {
        return dateOfIncident;
    }

    public void setDateOfIncident(LocalDate dateOfIncident) {
        this.dateOfIncident = dateOfIncident;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
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

    public Double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(Double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getClaimReason() {
        return claimReason;
    }

    public void setClaimReason(String claimReason) {
        this.claimReason = claimReason;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }
}

