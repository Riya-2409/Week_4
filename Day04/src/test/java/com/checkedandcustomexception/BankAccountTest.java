package com.checkedandcustomexception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testInsufficientBalanceException() {
        BankAccount account = new BankAccount(500);
        Exception exception = assertThrows(InsufficientBalanceException.class, () -> {
            account.withdraw(600);
        });
        assertEquals("Insufficient balance!", exception.getMessage());
    }

    @Test
    void testNegativeWithdrawalAmount() {
        BankAccount account = new BankAccount(500);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-100);
        });
        assertEquals("Invalid amount!", exception.getMessage());
    }

    @Test
    void testInitialNegativeBalance() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(-100);
        });
        assertEquals("Initial balance cannot be negative.", exception.getMessage());
    }
}

