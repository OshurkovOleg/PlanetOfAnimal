package ru.javarush.island.oshurkov.entity.herbivores;

import ru.javarush.island.oshurkov.entity.prefs.Fields;

public class Caterpillar extends Herbivores {
    public Caterpillar(Fields fields) {
        super(fields);
    }

    @Override
    public String toString() {
        return "Caterpillar";
    }
}
