package ru.javarush.island.oshurkov.entity.herbivores;

import ru.javarush.island.oshurkov.entity.prefs.Fields;

public class Boar extends Herbivores {
    public Boar(Fields fields) {
        super(fields);
    }

    @Override
    public String toString() {
        return "Boar";
    }
}
