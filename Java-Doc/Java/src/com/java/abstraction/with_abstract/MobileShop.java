package com.java.abstraction.with_abstract;

public class MobileShop {
    public static void main(String[] args) {
        Realme realme = new Realme();
        System.out.println(realme.camera());
        System.out.println(realme.ui());
        System.out.println(realme.call());

        Redmi redmi = new Redmi();
        System.out.println(redmi.camera());
        System.out.println(redmi.ui());
        System.out.println(realme.call());
    }
}
