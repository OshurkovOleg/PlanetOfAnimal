package ru.javarush.island.oshurkov.entity;

import ru.javarush.island.oshurkov.entity.prefs.Fields;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal extends Organism {

    private final int id = ThreadLocalRandom.current().nextInt();

    private final String name;

    private final double weightMin;

    private final double weight;

    private final double weightMax;

    private final int speedMax;

    private final int amountLocationMax;

    public Animal(Fields fields) {
        this.name = fields.getName();
        this.weightMin = fields.getWeightMin();
        this.weight = fields.getWeight();
        this.weightMax = fields.getWeightMax();
        this.speedMax = fields.getSpeedMax();
        this.amountLocationMax = fields.getAmountLocationMax();
    }

    @Override
    public String getName() {
        return name;
    }

    public double getWeightMin() {
        return weightMin;
    }

    public double getWeight() {
        return weight;
    }

    public double getWeightMax() {
        return weightMax;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public int getAmountLocationMax() {
        return amountLocationMax;
    }

    public int getId() {
        return id;
    }
}
