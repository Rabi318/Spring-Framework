package com.annot;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    @Autowired
    private  Address address;  //If we add @Autowired in this field it is called property injection

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setter Injection");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                '}';
    }
}