package com.htp.oop;

import java.util.Objects;

public class Cat extends Animal {
    private String ownerName;
    private String catType;

    public Cat() {
        System.out.println("In Cat default constructor");
    }

    public Cat(String animalName, double weight, int liveCount, String ownerName, String catType) {
        super(animalName, weight, liveCount);
        this.ownerName = ownerName;
        this.catType = catType;
        System.out.println("In Cat params constructor");
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(ownerName, cat.ownerName) &&
                Objects.equals(catType, cat.catType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ownerName, catType);
    }

    @Override
    public String toString() {
        return super.toString() + "ownerName :" + ownerName;
    }

    @Override
    public void run() {
        System.out.println("Run, cat, run!");
    }

    public long run(long someDistance) {
        System.out.println("Run, boy, run! " + someDistance);
        return someDistance;
    }
}
