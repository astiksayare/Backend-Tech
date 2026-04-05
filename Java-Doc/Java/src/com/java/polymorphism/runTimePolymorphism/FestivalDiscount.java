package com.java.polymorphism.runTimePolymorphism;

public class FestivalDiscount extends Discount {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.20; // 10% Discount
    }
}
