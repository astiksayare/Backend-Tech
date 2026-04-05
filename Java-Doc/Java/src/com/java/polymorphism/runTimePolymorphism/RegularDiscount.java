package com.java.polymorphism.runTimePolymorphism;

public class RegularDiscount extends Discount {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.05; // 5% Discount
    }
}
