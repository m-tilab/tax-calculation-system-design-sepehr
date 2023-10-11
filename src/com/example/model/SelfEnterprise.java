package com.example.model;

public class SelfEnterprise extends BaseBusinessType {

    @Override
    public double getTax() {
        return getTurnover() * 0.1;
    }
}
