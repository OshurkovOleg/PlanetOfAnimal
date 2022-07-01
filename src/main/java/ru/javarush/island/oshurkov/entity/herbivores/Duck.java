package ru.javarush.island.oshurkov.entity.herbivores;

import ru.javarush.island.oshurkov.entity.prefs.Fields;

public class Duck extends Herbivores {
    public Duck(Fields fields) {
        super(fields);
    }

    @Override
    public String toString() {
        return "Duck";
    }
}
