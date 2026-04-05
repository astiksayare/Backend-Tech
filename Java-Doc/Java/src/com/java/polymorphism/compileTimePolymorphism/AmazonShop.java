package com.java.polymorphism.compileTimePolymorphism;

import java.util.Arrays;
import java.util.List;

public class AmazonShop {
    public static void main(String[] args) {
        List<String> itemList = Arrays.asList("Double Masala Maggi", "Pintola Oats", "Apples", "Coriander");
        System.out.println("Ordered Item list: "+itemList);
        PaymentMethod.payThrough("PhonePay", 1500.00, 12345);

        System.out.println("-".repeat(10)+" Next Day Order "+"-".repeat(10));

        itemList = Arrays.asList("Perfume", "Halke-Fulke", "Bingo", "Ice-Cream");
        System.out.println("Ordered Item list: "+itemList);
        PaymentMethod.payThrough("Bengaluru, PG-123, Karnataka, 239203");
    }
}
