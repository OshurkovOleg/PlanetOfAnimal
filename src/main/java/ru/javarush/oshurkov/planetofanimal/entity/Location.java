package ru.javarush.oshurkov.planetofanimal.entity;

import java.util.ArrayList;
import java.util.List;

public class Location {


    List<Herbivores> HerbivoresAnimals = new ArrayList<>();
    List<Predators> PredatorsAnimals = new ArrayList<>();

    public List<Herbivores> getHerbivoresAnimals() {
        return HerbivoresAnimals;
    }

    public List<Predators> getPredatorsAnimals() {
        return PredatorsAnimals;
    }



    @Override
    public String toString() {
        return "Location{" +
                HerbivoresAnimals + PredatorsAnimals +
                '}';
    }
}
