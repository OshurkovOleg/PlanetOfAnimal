package ru.javarush.island.oshurkov.entity.predators;

import ru.javarush.island.oshurkov.entity.prefs.Fields;

public class Eagle extends Predators {
    public Eagle(Fields fields) {
        super(fields);
    }

    @Override
    public String toString() {
        return "Eagle";
    }
}
