package ru.javarush.island.oshurkov.entity.plants;

import ru.javarush.island.oshurkov.entity.Animal;
import ru.javarush.island.oshurkov.entity.prefs.Fields;

public class Plant extends Animal {
    public Plant(Fields fields) {
        super(fields);
    }

    @Override
    public String toString() {
        return "Plant";
    }
}
