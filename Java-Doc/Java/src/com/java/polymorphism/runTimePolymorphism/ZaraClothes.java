package com.java.polymorphism.runTimePolymorphism;

import java.util.Scanner;

public class ZaraClothes {
    public static void main(String[] args) {
        System.out.println("-".repeat(10)+" Welcome to Zara "+"-".repeat(10));
        System.out.println("Enter 1 for Regular discount");
        System.out.println("Enter 2 for Premium discount");
        System.out.println("Enter 3 for Festival discount");

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your offer type: ");
        int typeNumber = scn.nextInt();
        String type = "";

        switch (typeNumber) {
            case 1 -> type = "REGULAR";
            case 2 -> type = "PREMIUM";
            case 3 -> type = "FESTIVAL";
            default -> System.out.println("Invalid number entered, continue with regular discount...");
        }

        System.out.print("Enter the bill amount: ");
        double amount = scn.nextDouble();
        if(type.equals("FESTIVAL")) {
            System.out.println("For Amount: "+amount+", Discount: "+new FestivalDiscount().calculateDiscount(amount));
        }else if (type.equals("PREMIUM")) {
            System.out.println("For Amount: "+amount+", Discount: "+new PremiumDiscount().calculateDiscount(amount));
        }else {
            System.out.println("For Amount: "+amount+", Discount: "+new RegularDiscount().calculateDiscount(amount));
        }
    }
}
