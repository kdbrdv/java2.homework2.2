package com.company;

public class Bird extends Animal implements Printable {
    private int wings;

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    private Bird(String name, int wings) {
        super.setName(name);
        this.wings = wings;
    }

    @Override
    public void print() {

    }
}
