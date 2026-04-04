package com.java.inheritance;

import java.util.Arrays;

public class StudentForm extends AadharCard {
    int stdId;
    String collegeName;
    String collegeAddress;
    double percentage;
    String[] subjects;
    String email;

    public StudentForm(
            int stdId, String firstName, String middleName, String lastName, String dob,
            String email, long mobile, long aadharNumber,
            String state, String city, int pincode,
            String collegeName, String collegeAddress, double percentage,
            String[] subjects
            ) {
        super(aadharNumber, firstName, lastName, middleName, dob, city, state, pincode, mobile);
        this.stdId = stdId;
        this.email = email;
        this.collegeAddress = collegeAddress;
        this.collegeName = collegeName;
        this.percentage = percentage;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "StudentForm{" +
                "stdId=" + stdId +
                ", collegeName='" + collegeName + '\'' +
                ", collegAddress='" + collegeAddress + '\'' +
                ", percentage=" + percentage +
                ", subjects=" + Arrays.toString(subjects) +
                ", email='" + email + '\'' +
                ", aadharNumber=" + aadharNumber +
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
