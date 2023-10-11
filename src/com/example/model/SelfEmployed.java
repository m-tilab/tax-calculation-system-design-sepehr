package com.example.model;

public class SelfEmployed extends BaseBusinessType {

    @Override
    public double getTax() {
        return getTurnover() * 0.25;
    }

}
