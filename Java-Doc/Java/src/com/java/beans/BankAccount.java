package com.java.beans;

public class BankAccount {
    private long accountNumber;
    private double accountBalanace;
    private String accountName;

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalanace() {
        return this.accountBalanace;
    }

    public void setAccountBalance(double balance) {
        accountBalanace = balance;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String name) {
        accountName = name;
    }

}
