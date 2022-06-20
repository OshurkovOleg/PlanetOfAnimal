package com.javarush.island.oshurkov.entity;


import com.javarush.island.oshurkov.entity.herbivores.Herbivores;
import com.javarush.island.oshurkov.entity.plants.Plant;
import com.javarush.island.oshurkov.entity.predators.Predators;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class Location {
    private final List<Organism> organisms = new CopyOnWriteArrayList<>();



    public List<Organism> getOrganisms() {
        return organisms;
    }

    public void addOrganism(Organism organism) {
        organisms.add(organism);
    }



    @Override
    public String toString() {
        return "location";
    }
}