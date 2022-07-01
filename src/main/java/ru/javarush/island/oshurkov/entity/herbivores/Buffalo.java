package ru.javarush.island.oshurkov.entity.herbivores;

import ru.javarush.island.oshurkov.entity.prefs.Fields;

public class Buffalo extends Herbivores {
    public Buffalo(Fields fields) {
        super(fields);
    }

    @Override
    public String toString() {
        return "Buffalo";
    }
}
