package com.java.exceptions.custom_exception;

import java.util.Scanner;

public class BankDriver {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(2000);
        System.out.println("Your current balance: "+bankAccount.getBalance());
        System.out.print("Withdraw Money: ");
        double amount = new Scanner(System.in).nextDouble();

        try {
            bankAccount.withdrawMoney(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
