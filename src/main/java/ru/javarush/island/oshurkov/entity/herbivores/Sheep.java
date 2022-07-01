package ru.javarush.island.oshurkov.entity.herbivores;

import ru.javarush.island.oshurkov.entity.prefs.Fields;

public class Sheep extends Herbivores {
    public Sheep(Fields fields) {
        super(fields);
    }

    @Override
    public String toString() {
        return "Sheep";
    }
}
