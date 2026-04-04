package com.java.constructors;

public class Employee {
    int empId;
    double salary;
    String name;
    String address;
    String email;
    long mobile;

    public Employee(int empId, String name, String email, long mobile) {
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    protected Employee(int empId, String name, String email, String address, long mobile, double salary) {
        this(empId, name, email, mobile);
        this.address = address;
        this.salary = salary;
    }

    Employee(int empId) {}


    @Override
    public String toString() {
        return "Employee = name: "+this.name+", email: "+this.email+", address: "+this.address+", mobile: "+this.mobile+", salary: "+this.salary;
    }
}
