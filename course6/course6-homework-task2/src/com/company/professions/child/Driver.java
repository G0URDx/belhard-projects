package com.company.professions.child;

import com.company.professions.parent.Person;

public class Driver extends Person {
    private int experience;

    public Driver(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

}
