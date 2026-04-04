package com.java.inheritance;

public class AadharCard {
    long aadharNumber;
    String firstName;
    String lastName;
    String middleName;
    String dob;
    String city;
    String state;
    int pincode;
    long mobile;

    public AadharCard(long aadharNumber, String firstName, String lastName, String middleName, String dob, String city, String state, int pincode, long mobile) {
        this.aadharNumber = aadharNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dob = dob;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "AadharCard{" +
                "aadharNumber=" + aadharNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dob='" + dob + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                ", mobile=" + mobile +
                '}';
    }
}
