package com.problemsimplementbankingsystem;

class WithdrawalRequest<T extends Number> {
    private String accountNumber;
    private T amount;

    public WithdrawalRequest(String accountNumber, T amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getAccountNumber() { return accountNumber; }
    public T getAmount() { return amount; }

    @Override
    public String toString() {
        return "WithdrawalRequest[Account: " + accountNumber + ", Amount: " + amount + "]";
    }
}

