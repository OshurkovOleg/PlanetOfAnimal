package com.javarush.island.oshurkov.entity.plants;

import com.javarush.island.oshurkov.entity.Organism;

public class Plant extends Organism {

    public Plant() {
        this.setName("Plant");
    }

    @Override
    public String toString() {
        return "Plant";
    }
}
