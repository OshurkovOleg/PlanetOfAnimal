package ru.javarush.island.oshurkov.entity.herbivores;

import ru.javarush.island.oshurkov.entity.prefs.Fields;

public class Horse extends Herbivores {

    public Horse(Fields fields) {
        super(fields);
    }


    @Override
    public String toString() {
        return "Horse";
    }
}
