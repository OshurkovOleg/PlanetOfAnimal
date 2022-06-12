package ru.javarush.oshurkov.planetofanimal.entity;

public abstract class Animal {
    int weight;
    int speedWalk;
    int sateity;

    public Animal(int weight, int speedWalk, int sateity) {
        this.weight = weight;
        this.speedWalk = speedWalk;
        this.sateity = sateity;
    }

    void eat(){

    }

    void move(){

    }

    Animal reproduce() {
        return null;
    }



}
