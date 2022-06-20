package com.javarush.island.oshurkov.entity.herbivores;

import com.javarush.island.oshurkov.util.Randomize;

public class Horse extends Herbivores {

    public int direction = Randomize.getRandomNumber(4);
    public boolean isDone = false;

    public Horse() {
        this.setName("Horse");
        this.setMaxSatiety(60);
        this.setSpeed(4);
        this.setWeight(400);
        this.setSatiety(Randomize.getRandomNumber(getMaxSatiety()));
    }

    public boolean getDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public int getDirection() {
        return direction;
    }


    @Override
    public String toString() {
        return "Horse";
    }
}
