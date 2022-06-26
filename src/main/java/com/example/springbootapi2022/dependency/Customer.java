package com.example.springbootapi2022.dependency;

public class Customer {
    private String name;
    private Address address;

    // Default constructor
    public Customer() {

    }

    public Customer(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
