package com.htp.oop;

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal testAnimal = new Cat();
        Cat cat = new Cat();

        animal.run();
        testAnimal.run();
        cat.run();
    }
}
