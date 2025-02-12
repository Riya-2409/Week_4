package com.problemsinsurancepoilicysystem;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create the system for generic InsurancePolicy management
        InsurancePolicyManagementSystem<String> system = new InsurancePolicyManagementSystem<>();

        // Create some generic policies (using String as the additional details type)
        InsurancePolicy<String> policy1 = new InsurancePolicy<>("A001", "RAM", LocalDate.of(2025, 5, 15), "Health", 500.00, "No additional details");
        InsurancePolicy<String> policy2 = new InsurancePolicy<>("A002", "JOHN", LocalDate.of(2025, 3, 20), "Auto", 300.00, "No additional details");
        InsurancePolicy<String> policy3 = new InsurancePolicy<>("A003", "JULIE", LocalDate.of(2025, 6, 1), "Home", 450.00, "No additional details");
        InsurancePolicy<String> policy4 = new InsurancePolicy<>("A004", "SAM", LocalDate.of(2025, 2, 10), "Health", 550.00, "No additional details");

        // Add policies to the system
        system.addPolicy(policy1);
        system.addPolicy(policy2);
        system.addPolicy(policy3);
        system.addPolicy(policy4);

        // Display all policies
        system.displayAllPolicies();

        // List policies expiring in the next 30 days
        system.listPoliciesExpiringSoon();

        // List policies by a specific policyholder
        system.listPoliciesByPolicyholder("RAM");

        // Remove expired policies
        system.removeExpiredPolicies();

        // Display all policies after removing expired ones
        system.displayAllPolicies();

        // Display policies in insertion order (LinkedHashMap)
        system.displayPoliciesInOrder();

        // Display policies sorted by expiry date (TreeMap)
        system.displayPoliciesSortedByExpiryDate();
    }
}

