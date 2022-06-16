package ru.javarush.oshurkov.planetofanimal.entity;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Location {
    private final List<Herbivores> herbivores = new CopyOnWriteArrayList<>();
    private final List<Predators> predators = new CopyOnWriteArrayList<>();
    private final List<Plant> plants = new ArrayList<>();

    public List<Herbivores> getHerbivores() {
        return herbivores;
    }

    public List<Predators> getPredators() {
        return predators;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void addHerb(Herbivores herbivoresAnimal) {
        herbivores.add(herbivoresAnimal);
    }

    public void addPred(Predators predatorsAnimal) {
        predators.add(predatorsAnimal);
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }


    @Override
    public String toString() {
        return "location";
    }
}