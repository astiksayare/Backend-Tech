package com.java.abstraction.with_interface;

public class PaymentDriver {
    public static void main(String[] args) {
        PhonePay phonePay = new PhonePay();
        phonePay.pay(1200.00);
        phonePay.totalBalance(3000);
        Payment.divider();
        BhimApp bhimApp = new BhimApp();
        bhimApp.pay(100);
        bhimApp.totalBalance(5000);
    }
}
