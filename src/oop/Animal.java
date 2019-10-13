package com.htp.oop;

import java.util.Objects;

public class Animal {
    private String animalName;
    private double weight;
    protected int liveCount;

    public Animal() {
        System.out.println("Default constructor");
    }

    public Animal(String animalName, double weight, int liveCount) {
        System.out.println("In Animal params constructor");
        this.animalName = animalName;
        this.weight = weight;
        this.liveCount = liveCount;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLiveCount() {
        return liveCount;
    }

    public void setLiveCount(int liveCount) {
        this.liveCount = liveCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.weight, weight) == 0 &&
                liveCount == animal.liveCount &&
                Objects.equals(animalName, animal.animalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalName, weight, liveCount);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", weight=" + weight +
                ", liveCount=" + liveCount +
                '}';
    }

    public void run() {
        System.out.println("Run, boy, run!");
    }

    public void run(int distance) {
        System.out.println("Run, boy, run! " + distance);
    }

    public void run(int distance, String destination) {
        System.out.println("Run, boy, run! " + distance + " to " + destination);
    }


}
