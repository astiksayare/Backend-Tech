package com.java.abstraction.with_interface;

public interface Payment {
    void pay(double amount);
    default void totalBalance(double amount) {
        System.out.println("Total Balance available: "+amount);
    }
    static void divider() {
        System.out.println("-".repeat(20));
    }
}
