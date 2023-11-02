package com.autowire.xml;

public class Student {
    private Address address;
    //  byName autowiring variable address name and the Address bean name should be same.


    public Student(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                '}';
    }
}
