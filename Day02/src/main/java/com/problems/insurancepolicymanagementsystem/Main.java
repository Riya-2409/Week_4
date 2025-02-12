package com.problems.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a policy management system for InsurancePolicy objects
        PolicyManagementSystem<InsurancePolicy> system = new PolicyManagementSystem<>();

        // Add sample policies
        system.addPolicy(new InsurancePolicy("101", "Ram", LocalDate.now().plusDays(15), "Health", 1200.50));
        system.addPolicy(new InsurancePolicy("102", "Sam", LocalDate.now().plusDays(40), "Auto", 1500.75));
        system.addPolicy(new InsurancePolicy("103", "Julie", LocalDate.now().plusDays(10), "Home", 1800.00));
        system.addPolicy(new InsurancePolicy("101", "Ram", LocalDate.now().plusDays(15), "Health", 1200.50)); // Duplicate

        // Display policies
        system.displayAllPolicies();
        system.displayExpiringSoon();
        system.displayByCoverageType("Health");

        // Find duplicates
        system.displayDuplicatePolicies(List.of(
                new InsurancePolicy("101", "Ram", LocalDate.now().plusDays(15), "Health", 1200.50),
                new InsurancePolicy("101", "Ram", LocalDate.now().plusDays(15), "Health", 1200.50),
                new InsurancePolicy("103", "Julie", LocalDate.now().plusDays(10), "Home", 1800.00)
        ));

        // Performance Test
        system.performanceTest(10000);
    }
}

