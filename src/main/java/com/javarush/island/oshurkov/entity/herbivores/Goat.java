package com.javarush.island.oshurkov.entity.herbivores;

import com.javarush.island.oshurkov.util.Randomize;

public class Goat extends Herbivores {

    public int direction = Randomize.getRandomNumber(4);
    public boolean isDone = false;

    public Goat() {
        this.setName("Goat");
        this.setMaxSatiety(15);
        this.setSpeed(3);
        this.setWeight(70);
        this.setSatiety(Randomize.getRandomNumber(getMaxSatiety()));
    }


    @Override
    public String toString() {
        return "Goat";
    }
}
