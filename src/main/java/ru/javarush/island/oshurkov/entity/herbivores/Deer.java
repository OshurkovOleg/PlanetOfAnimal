package ru.javarush.island.oshurkov.entity.herbivores;

import ru.javarush.island.oshurkov.entity.prefs.Fields;

public class Deer extends Herbivores {
    public Deer(Fields fields) {
        super(fields);
    }

    @Override
    public String toString() {
        return "Deer";
    }
}
