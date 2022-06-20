package com.javarush.island.oshurkov.entity;

import com.javarush.island.oshurkov.interfaces.Eating;
import com.javarush.island.oshurkov.interfaces.Movable;
import com.javarush.island.oshurkov.util.Randomize;

import java.util.List;

public abstract class Animal extends Organism implements Movable, Eating {

    private int maxSatiety;

    private int weight;
    private int speed;
    private int satiety;


    public int getMaxSatiety() {
        return maxSatiety;
    }

    public void setMaxSatiety(int maxSatiety) {
        this.maxSatiety = maxSatiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSatiety() {
        return satiety;
    }

    @Override
    public void eat() {
    }

    @Override
    public void move() {


    }

}
