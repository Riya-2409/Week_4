package com.problemsinsurancepoilicysystem;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManagementSystem<T> {
    private Map<String, InsurancePolicy<T>> policiesHashMap = new HashMap<>();
    private Map<String, InsurancePolicy<T>> policiesLinkedHashMap = new LinkedHashMap<>();
    private Map<LocalDate, List<InsurancePolicy<T>>> policiesTreeMap = new TreeMap<>();

    // Add a policy
    public void addPolicy(InsurancePolicy<T> policy) {
        policiesHashMap.put(policy.getPolicyNumber(), policy);
        policiesLinkedHashMap.put(policy.getPolicyNumber(), policy);
        policiesTreeMap.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>()).add(policy);
    }

    // Retrieve a policy by its number
    public InsurancePolicy<T> getPolicyByNumber(String policyNumber) {
        return policiesHashMap.get(policyNumber);
    }

    // List all policies expiring within the next 30 days
    public void listPoliciesExpiringSoon() {
        LocalDate threshold = LocalDate.now().plusDays(30);
        System.out.println("\nPolicies Expiring in the Next 30 Days:");
        for (List<InsurancePolicy<T>> policyList : policiesTreeMap.values()) {
            for (InsurancePolicy<T> policy : policyList) {
                if (policy.getExpiryDate().isBefore(threshold) || policy.getExpiryDate().isEqual(threshold)) {
                    System.out.println(policy);
                }
            }
        }
    }

    // List all policies for a specific policyholder
    public void listPoliciesByPolicyholder(String policyholderName) {
        System.out.println("\nPolicies for Policyholder: " + policyholderName);
        policiesHashMap.values().stream()
                .filter(policy -> policy.getPolicyholderName().equalsIgnoreCase(policyholderName))
                .forEach(System.out::println);
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        System.out.println("\nRemoving Expired Policies:");
        policiesHashMap.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
        policiesLinkedHashMap.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
        policiesTreeMap.values().forEach(policyList -> policyList.removeIf(policy -> policy.getExpiryDate().isBefore(today)));
    }

    // Display all policies
    public void displayAllPolicies() {
        System.out.println("\nAll Policies (HashMap):");
        policiesHashMap.values().forEach(System.out::println);
    }

    // Display policies in insertion order
    public void displayPoliciesInOrder() {
        System.out.println("\nPolicies in Insertion Order (LinkedHashMap):");
        policiesLinkedHashMap.values().forEach(System.out::println);
    }

    // Display policies sorted by expiry date
    public void displayPoliciesSortedByExpiryDate() {
        System.out.println("\nPolicies Sorted by Expiry Date (TreeMap):");
        policiesTreeMap.forEach((expiryDate, policyList) -> {
            policyList.forEach(policy -> System.out.println(policy));
        });
    }
}

