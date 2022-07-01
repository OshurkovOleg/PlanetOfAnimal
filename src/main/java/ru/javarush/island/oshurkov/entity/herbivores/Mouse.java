package ru.javarush.island.oshurkov.entity.herbivores;

import ru.javarush.island.oshurkov.entity.prefs.Fields;

public class Mouse extends Herbivores {
    public Mouse(Fields fields) {
        super(fields);
    }

    @Override
    public String toString() {
        return "Mouse";
    }
}
