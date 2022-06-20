package com.javarush.island.oshurkov.entity.predators;

import com.javarush.island.oshurkov.util.Randomize;

public class Wolf extends Predators {

    public int direction = Randomize.getRandomNumber(4);
    public boolean isDone = false;

    public Wolf() {
        this.setName("Wolf");
        this.setMaxSatiety(8);
        this.setSpeed(3);
        this.setWeight(50);
        this.setSatiety(Randomize.getRandomNumber(getMaxSatiety()));
    }

    @Override
    public String toString() {
        return "Wolf";
    }
}
