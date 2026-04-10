package com.java.exceptions.custom_exception;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdrawMoney(double amount) throws InsufficientBalanceException {
        if(balance < amount) throw new InsufficientBalanceException("Insufficient Balance...");

        balance -= amount;
        System.out.println("Your current balance is: "+balance);
    }
}
