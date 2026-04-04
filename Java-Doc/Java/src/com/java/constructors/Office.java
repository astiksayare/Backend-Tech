package com.java.constructors;

public class Office {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Astik", "astik@gmail.com", 9922480422L);
        System.out.println(emp);

        emp = new Employee(101, "Rahul", "rahul@gmail.com", "Bengaluru", 98394823932L, 25000.00);
        System.out.println(emp);
    }
}
