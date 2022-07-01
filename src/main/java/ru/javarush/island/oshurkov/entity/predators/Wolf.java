package ru.javarush.island.oshurkov.entity.predators;

import ru.javarush.island.oshurkov.entity.prefs.Fields;

public class Wolf extends Predators {

    public Wolf(Fields fields) {
        super(fields);
    }

    @Override
    public String toString() {
        return "Wolf";
    }
}
