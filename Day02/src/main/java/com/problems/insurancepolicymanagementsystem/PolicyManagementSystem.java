package com.problems.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Generic Policy Management System
public class PolicyManagementSystem<T extends InsurancePolicy> {
    private Set<T> hashSet = new HashSet<>(); // Fast lookups
    private Set<T> linkedHashSet = new LinkedHashSet<>(); // Maintains insertion order
    private Set<T> treeSet = new TreeSet<>(); // Sorted by expiry date

    // Add a policy to all sets
    public void addPolicy(T policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // Retrieve all unique policies
    public void displayAllPolicies() {
        System.out.println("\nAll Unique Policies (HashSet):");
        hashSet.forEach(System.out::println);
    }

    // Retrieve policies expiring within the next 30 days
    public void displayExpiringSoon() {
        LocalDate threshold = LocalDate.now().plusDays(30);
        System.out.println("\nPolicies Expiring Within 30 Days:");
        treeSet.stream()
                .filter(p -> p.getExpiryDate().isBefore(threshold))
                .forEach(System.out::println);
    }

    // Retrieve policies by coverage type
    public void displayByCoverageType(String coverageType) {
        System.out.println("\nPolicies with Coverage Type: " + coverageType);
        hashSet.stream()
                .filter(p -> p.getCoverageType().equalsIgnoreCase(coverageType))
                .forEach(System.out::println);
    }

    // Find duplicate policies by policy number
    public void displayDuplicatePolicies(List<T> policies) {
        Map<String, Long> frequencyMap = policies.stream()
                .collect(Collectors.groupingBy(T::getPolicyNumber, Collectors.counting()));

        System.out.println("\nDuplicate Policies:");
        frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("Policy Number: " + entry.getKey() + ", Count: " + entry.getValue()));
    }

    // Generic method to filter policies based on a predicate
    public void displayFilteredPolicies(Predicate<T> predicate, String filterDescription) {
        System.out.println("\nFiltered Policies - " + filterDescription);
        hashSet.stream().filter(predicate).forEach(System.out::println);
    }

    // Performance Test
    public void performanceTest(int numPolicies) {
        List<T> samplePolicies = new ArrayList<>();
        for (int i = 0; i < numPolicies; i++) {
            samplePolicies.add((T) new InsurancePolicy(
                    "P" + i, "Holder" + i, LocalDate.now().plusDays(i), "Health", 1000 + i));
        }

        long start, end;

        // HashSet Performance
        start = System.nanoTime();
        samplePolicies.forEach(hashSet::add);
        end = System.nanoTime();
        System.out.println("\nHashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        samplePolicies.forEach(hashSet::contains);
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        samplePolicies.forEach(hashSet::remove);
        end = System.nanoTime();
        System.out.println("HashSet Remove Time: " + (end - start) + " ns");

        // HashSet Performance
        start = System.nanoTime();
        samplePolicies.forEach(hashSet::add);
        end = System.nanoTime();
        System.out.println("\nHashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        samplePolicies.forEach(hashSet::contains);
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        samplePolicies.forEach(hashSet::remove);
        end = System.nanoTime();
        System.out.println("HashSet Remove Time: " + (end - start) + " ns");

        // LinkedHashSet Performance
        start = System.nanoTime();
        samplePolicies.forEach(linkedHashSet::add);
        end = System.nanoTime();
        System.out.println("\nLinkedHashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        samplePolicies.forEach(linkedHashSet::contains);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        samplePolicies.forEach(linkedHashSet::remove);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Remove Time: " + (end - start) + " ns");

        // TreeSet Performance
        start = System.nanoTime();
        samplePolicies.forEach(treeSet::add);
        end = System.nanoTime();
        System.out.println("\nTreeSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        samplePolicies.forEach(treeSet::contains);
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        samplePolicies.forEach(treeSet::remove);
        end = System.nanoTime();
        System.out.println("TreeSet Remove Time: " + (end - start) + " ns");
    }
}

