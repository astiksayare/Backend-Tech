package com.java.polymorphism.compileTimePolymorphism;

// Compile Time Polymorphism
public class PaymentMethod {

    // Cash on delivery
    public static String payThrough(String location) {
        System.out.println("Order will reach to your location: "+location);
        return "Payment Through: COD (Cash On Delivery)";
    }

    // Credit Card
    public static String payThrough(long creditCardNumber, int pin, double amount) {
        System.out.println("Your Credit Card Number is: "+creditCardNumber+", and the pin is: "+pin);
        System.out.println("Amount Paid: "+amount);
        return "Payment Through: Credit Card";
    }

    // UPI
    public static String payThrough(String paymentType, double amount, int upiPincode) {
        System.out.println("Payment App: "+paymentType);
        System.out.println("Amount Paid: "+amount);
        System.out.println("UPI Pin-code: "+upiPincode);
        return "Payment Through: UPI";
    }

    // Net-Banking
    public static String payThrough(String bankName, long accountNumber, double amount) {
        System.out.println("Bank Name: "+bankName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Amount: "+amount);
        return "Payment Through: Net-Banking";
    }
}
