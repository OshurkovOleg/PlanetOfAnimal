package ru.javarush.island.oshurkov.entity.herbivores;

import ru.javarush.island.oshurkov.entity.Animal;
import ru.javarush.island.oshurkov.entity.prefs.Fields;

public abstract class Herbivores extends Animal {
    public Herbivores(Fields fields) {
        super(fields);
    }
}