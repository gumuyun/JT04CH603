package com.zcbdqn.pojo;

public class Penguin extends Pet {

    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "gender='" + gender + '\'' +
                '}';
    }
}
