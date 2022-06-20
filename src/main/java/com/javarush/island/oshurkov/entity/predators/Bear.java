package com.javarush.island.oshurkov.entity.predators;

import com.javarush.island.oshurkov.util.Randomize;

public class Bear extends Predators {

    public int direction = Randomize.getRandomNumber(4);
    public boolean isDone = false;

    public Bear() {
        this.setName("Bear");
        this.setMaxSatiety(80);
        this.setSpeed(2);
        this.setWeight(500);
        this.setSatiety(Randomize.getRandomNumber(getMaxSatiety()));
    }

    @Override
    public String toString() {
        return "Bear";
    }
}
