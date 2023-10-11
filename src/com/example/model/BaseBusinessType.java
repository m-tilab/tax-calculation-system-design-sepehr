package com.example.model;

public abstract class BaseBusinessType {

    private int siretNDegree;
    private int denomination;
    private int turnover;

    public int getTurnover() {
        return turnover;
    }

    public void setTurnover(int turnover) {
        this.turnover = turnover;
    }

    public int getSiretNDegree() {
        return siretNDegree;
    }

    public void setSiretNDegree(int siretNDegree) {
        this.siretNDegree = siretNDegree;
    }

    public int getDenomination() {
        return denomination;
    }

    public void setDenomination(int denomination) {
        this.denomination = denomination;
    }

    public abstract double getTax();
}
