package com.example.model;

public class SAS extends BaseBusinessType {

    private String registeredAddress;

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    @Override
    public double getTax() {
        return getTurnover() * 0.33;
    }
}
