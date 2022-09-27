package com.company.professions;

import com.company.Person;

public class Driver extends Person {
    private int exp;
    Driver(){}

    public Driver(int age, String fullName, int exp) {
        super(age, fullName);
        this.exp = exp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "age=" + age +
                ", fullName='" + fullName + '\'' +
                ", exp=" + exp +
                '}';
    }
}
