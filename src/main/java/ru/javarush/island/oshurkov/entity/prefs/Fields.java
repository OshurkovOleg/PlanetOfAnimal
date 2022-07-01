package ru.javarush.island.oshurkov.entity.prefs;

public class Fields {

    private final String name;

    private final int amountLocationMax;

    private final double weightMin;

    private final double weight;

    private final double weightMax;

    private final int speedMax;

    public Fields(String name, int amountLocationMax, double weightMin, double weight, double weightMax, int speedMax) {
        this.name = name;
        this.amountLocationMax = amountLocationMax;
        this.weightMin = weightMin;
        this.weight = weight;
        this.weightMax = weightMax;
        this.speedMax = speedMax;
    }

    public String getName() {
        return name;
    }

    public int getAmountLocationMax() {
        return amountLocationMax;
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

    @Override
    public String toString() {
        return "Fields{" +
                "name='" + name + '\'' +
                ", amountLocationMax=" + amountLocationMax +
                ", weightMin=" + weightMin +
                ", weight=" + weight +
                ", weightMax=" + weightMax +
                ", speedMax=" + speedMax +
                '}';
    }
}



