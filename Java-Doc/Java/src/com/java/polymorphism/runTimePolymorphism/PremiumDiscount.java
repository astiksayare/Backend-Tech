package com.java.polymorphism.runTimePolymorphism;

public class PremiumDiscount extends Discount {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10; // 10% discount
    }
}
