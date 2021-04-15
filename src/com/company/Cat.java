package com.company;

public class Cat extends Animal implements Printable {
    private String color;
    private int claws;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getClaws() {
        return claws;
    }

    public void setClaws(int claws) {
        this.claws = claws;
    }

    private Cat(String name, String color, int claws) {
        super.setName(name);
        this.claws = claws;
        this.color = color;
    }


    @Override
    public void print() {

    }
}
