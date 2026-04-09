package com.java.beans;

import java.util.Scanner;

public class BOIBank {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your bank account name: ");
        String accountName = scn.nextLine();

        System.out.print("Enter your bank account number: ");
        long accountNumber = scn.nextLong();

        System.out.print("Enter money: ");
        double balance = scn.nextDouble();

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountName(accountName);
        bankAccount.setAccountBalance(balance);
        bankAccount.setAccountNumber(accountNumber);

        System.out.println("Account Name: "+bankAccount.getAccountName());
        System.out.println("Account Number: "+bankAccount.getAccountNumber());
        System.out.println("Total Balance: "+bankAccount.getAccountBalanace());
    }
}
