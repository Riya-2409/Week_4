package com.problemsimplementbankingsystem;

import java.util.Objects;

class Account<T extends Number> {
    private String accountNumber;
    private T balance; // Using a generic type for balance (e.g., Double, Integer)

    public Account(String accountNumber, T balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public T getBalance() { return balance; }

    // Generic method to deposit
    public void deposit(T amount) {
        if (amount.doubleValue() > 0) {
            balance = (T) Double.valueOf(balance.doubleValue() + amount.doubleValue());
        }
    }

    // Generic method to withdraw
    public boolean withdraw(T amount) {
        if (amount.doubleValue() > 0 && balance.doubleValue() >= amount.doubleValue()) {
            balance = (T) Double.valueOf(balance.doubleValue() - amount.doubleValue());
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account[" + accountNumber + ", Balance: " + balance + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account<?> account = (Account<?>) obj;
        return Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }
}

