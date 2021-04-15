package com.company;

public class Dog extends Animal implements Printable {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private Dog(String name, String color){
        super.setName(name);
        this.color = color;
    }
    @Override
    public void print() {

    }
}
