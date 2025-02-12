package com.problemsimplementbankingsystem;

public class Main {
    public static void main(String[] args) {
        BankingSystem<Double> bank = new BankingSystem<>();

        // Add customer accounts with generic balances
        bank.addAccount("A101", 5000.00);
        bank.addAccount("A102", 2500.00);
        bank.addAccount("A103", 7000.00);
        bank.addAccount("A104", 3000.00);

        // Display sorted accounts by balance
        bank.displayAccountsSortedByBalance();

        // Deposit money into accounts
        bank.deposit("A102", 2000.00);
        bank.displayAccountsSortedByBalance();

        // Request withdrawals
        bank.requestWithdrawal("A101", 1000.00);
        bank.requestWithdrawal("A102", 5000.00);
        bank.requestWithdrawal("A103", 3000.00);

        // Process withdrawals
        bank.processWithdrawals();
        bank.displayAccountsSortedByBalance();
    }
}

