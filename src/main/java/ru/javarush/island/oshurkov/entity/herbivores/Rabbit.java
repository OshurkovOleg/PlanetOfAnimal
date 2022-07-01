package ru.javarush.island.oshurkov.entity.herbivores;

import ru.javarush.island.oshurkov.entity.prefs.Fields;

public class Rabbit extends Herbivores {
    public Rabbit(Fields fields) {
        super(fields);
    }

    @Override
    public String toString() {
        return "Rabbit";
    }
}
