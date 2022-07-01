package ru.javarush.island.oshurkov.entity.predators;

import ru.javarush.island.oshurkov.entity.prefs.Fields;

public class Bear extends Predators {

    public Bear(Fields fields) {
        super(fields);
    }

    @Override
    public String toString() {
        return "Bear";
    }
}
