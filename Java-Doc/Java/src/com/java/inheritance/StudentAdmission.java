package com.java.inheritance;

import java.util.Arrays;

public class StudentAdmission {
    public static void main(String[] args) {

        StudentForm form1 = new StudentForm(101, "Joe", "Hammer", "Son", "12/12/2002",
                "joe@gmail.com", 9898989898L, 12323728729L,
                "Karnataka", "Bengaluru", 12345, "AIMS Institutes",
                "1st cross, 1st stage, Peenya, Bengaluru-560058", 98.99,
                new String[] {"Physics", "Chemistry", "Mathematics", "Biology", "IT"});

        System.out.println(form1);
        System.out.println("-".repeat(10)+" Student Personal Details "+"-".repeat(10));
        System.out.println("Student id: "+form1.stdId);
        System.out.println("Student First Name: "+form1.firstName);
        System.out.println("Student Middle Name: "+form1.middleName);
        System.out.println("Student Last Name: "+form1.lastName);
        System.out.println("Student Aadhaar Card Number: "+form1.aadharNumber);
        System.out.println("Student Email id: "+form1.email);
        System.out.println("Student Mobile Number: "+form1.mobile);

        System.out.println("-".repeat(10)+" College Details "+"-".repeat(10));
        System.out.println("College subjects: "+ Arrays.toString(form1.subjects));
        System.out.println("Student College Name: "+form1.collegeName);
        System.out.println("Student College Address: "+form1.collegeAddress);
        System.out.println("Student Percentage: "+form1.percentage);

        System.out.println("-".repeat(10)+" Permanent Address "+"-".repeat(10));
        System.out.println("State: "+form1.state);
        System.out.println("City: "+form1.city);
        System.out.println("Pincode: "+form1.pincode);


    }
}
