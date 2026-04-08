package com.java.abstraction.with_interface;

public class BhimApp implements Payment
{
    @Override
    public void pay(double amount) {
        System.out.println("The Payment rupees: "+amount+" done by the Bhim App");
    }
}
