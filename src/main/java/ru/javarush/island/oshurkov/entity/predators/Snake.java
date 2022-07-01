package ru.javarush.island.oshurkov.entity.predators;

import ru.javarush.island.oshurkov.entity.prefs.Fields;

public class Snake extends Predators {
    public Snake(Fields fields) {
        super(fields);
    }

    @Override
    public String toString() {
        return "Snake";
    }
}
