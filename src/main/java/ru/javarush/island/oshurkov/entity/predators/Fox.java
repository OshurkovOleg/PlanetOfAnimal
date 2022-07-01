package ru.javarush.island.oshurkov.entity.predators;

import ru.javarush.island.oshurkov.entity.prefs.Fields;

public class Fox extends Predators {
    public Fox(Fields fields) {
        super(fields);
    }

    @Override
    public String toString() {
        return "Fox";
    }
}
