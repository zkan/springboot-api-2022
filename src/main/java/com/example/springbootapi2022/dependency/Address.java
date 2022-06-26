package com.example.springbootapi2022.dependency;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String addressNo = "99/999";
    private String addressName = "Tiwanon Village";

    public String getAddressNo() {
        return addressNo;
    }

    public void setAddressNo(String addressNo) {
        this.addressNo = addressNo;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }
}
