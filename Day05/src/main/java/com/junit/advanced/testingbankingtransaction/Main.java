package com.junit.advanced.testingbankingtransaction;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500);
        System.out.println("After Deposit: " + account.getBalance());

        account.withdraw(200);
        System.out.println("After Withdrawal: " + account.getBalance());
    }
}
