package com.problemsinsurancepoilicysystem;

import java.time.LocalDate;

public class InsurancePolicy<T> {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;
    private T additionalDetails; // Generic field for any additional details about the policy

    // Constructor
    public InsurancePolicy(String policyNumber, String policyholderName, LocalDate expiryDate,
                           String coverageType, double premiumAmount, T additionalDetails) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
        this.additionalDetails = additionalDetails;
    }

    // Getters
    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public T getAdditionalDetails() {
        return additionalDetails;
    }

    @Override
    public String toString() {
        return "Policy Number: " + policyNumber +
                ", Policyholder: " + policyholderName +
                ", Expiry Date: " + expiryDate +
                ", Coverage Type: " + coverageType +
                ", Premium Amount: " + premiumAmount +
                ", Additional Details: " + additionalDetails;
    }
}

