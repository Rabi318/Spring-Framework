package com.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

    @Autowired
    @Qualifier("address2")
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
