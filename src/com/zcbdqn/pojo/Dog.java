package com.zcbdqn.pojo;

public class Dog extends Pet {

    private String strain;

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "strain='" + strain + '\'' +
                '}';
    }
}
