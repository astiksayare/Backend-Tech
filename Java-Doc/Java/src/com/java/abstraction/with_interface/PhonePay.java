package com.java.abstraction.with_interface;

public class PhonePay implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment rupees: "+amount+" done by the Phone Pay app.");
    }
}
