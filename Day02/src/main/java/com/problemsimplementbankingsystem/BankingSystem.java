package com.problemsimplementbankingsystem;

import java.util.*;

class BankingSystem<T extends Number> {
    private Map<String, Account<T>> accounts = new HashMap<>(); // Using generics for account handling
    private TreeMap<Double, List<Account<T>>> sortedAccounts = new TreeMap<>(); // Sorting accounts by balance
    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>(); // Queue to process withdrawal requests

    // Add an account
    public void addAccount(String accountNumber, T initialBalance) {
        Account<T> newAccount = new Account<>(accountNumber, initialBalance);
        accounts.put(accountNumber, newAccount);
        addToSortedAccounts(newAccount);
    }

    // Deposit money into an account
    public void deposit(String accountNumber, T amount) {
        Account<T> account = accounts.get(accountNumber);
        if (account != null) {
            removeFromSortedAccounts(account);
            account.deposit(amount);
            addToSortedAccounts(account);
        }
    }

    // Request a withdrawal (added to queue)
    public void requestWithdrawal(String accountNumber, T amount) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.offer(new WithdrawalRequest(accountNumber, amount));
        }
    }

    // Process all withdrawal requests
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            Account<T> account = accounts.get(request.getAccountNumber());
            if (account != null) {
                removeFromSortedAccounts(account);
                if (account.withdraw((T) request.getAmount())) {
                    System.out.println("Withdrawal successful: " + request);
                } else {
                    System.out.println("Withdrawal failed (Insufficient funds): " + request);
                }
                addToSortedAccounts(account);
            }
        }
    }

    // Display all accounts sorted by balance
    public void displayAccountsSortedByBalance() {
        System.out.println("\nAccounts Sorted by Balance:");
        sortedAccounts.forEach((balance, accountList) ->
                accountList.forEach(System.out::println));
    }

    // Remove an account from sorted map before updating balance
    private void removeFromSortedAccounts(Account<T> account) {
        sortedAccounts.get(account.getBalance().doubleValue()).remove(account);
        if (sortedAccounts.get(account.getBalance().doubleValue()).isEmpty()) {
            sortedAccounts.remove(account.getBalance().doubleValue());
        }
    }

    // Add an account back to sorted map after updating balance
    private void addToSortedAccounts(Account<T> account) {
        sortedAccounts.computeIfAbsent(account.getBalance().doubleValue(), k -> new ArrayList<>()).add(account);
    }
}

