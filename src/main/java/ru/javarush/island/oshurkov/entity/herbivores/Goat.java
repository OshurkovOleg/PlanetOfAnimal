package ru.javarush.island.oshurkov.entity.herbivores;

import ru.javarush.island.oshurkov.entity.prefs.Fields;

public class Goat extends Herbivores {
    public Goat(Fields fields) {
        super(fields);
    }

    @Override
    public String toString() {
        return "Goat";
    }
}
