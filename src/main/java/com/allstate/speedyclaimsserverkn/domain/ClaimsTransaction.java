package com.allstate.speedyclaimsserverkn.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="claims_transaction")
public class ClaimsTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate dateOfClaim;
    private LocalDate dateOfIncident;
    private String policyNo;
    private String title;
    private String custForename;
    private String custSurname;
    private Double claimAmount;
    private String claimReason;
    private String claimType;

    public ClaimsTransaction() {

    }

    public ClaimsTransaction(Integer id, LocalDate dateOfClaim, LocalDate dateOfIncident, String policyNo, String title, String custForename, String custSurname, Double claimAmount, String claimReason, String claimType) {
        this.id = id;
        this.dateOfClaim = dateOfClaim;
        this.dateOfIncident = dateOfIncident;
        this.policyNo = policyNo;
        this.title = title;
        this.custForename = custForename;
        this.custSurname = custSurname;
        this.claimAmount = claimAmount;
        this.claimReason = claimReason;
        this.claimType = claimType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDateOfClaim() {
        return dateOfClaim;
    }

    public void setDateOfClaim(LocalDate dateOfClaim) {
        this.dateOfClaim = dateOfClaim;
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

    @Override
    public String toString() {
        return "ClaimsTransaction{" +
                "id=" + id +
                ", dateOfClaim=" + dateOfClaim +
                ", dateOfIncident=" + dateOfIncident +
                ", policyNo='" + policyNo + '\'' +
                ", title='" + title + '\'' +
                ", custForename='" + custForename + '\'' +
                ", custSurname='" + custSurname + '\'' +
                ", claimAmount=" + claimAmount +
                ", claimReason='" + claimReason + '\'' +
                ", claimType='" + claimType + '\'' +
                '}';
    }
}
