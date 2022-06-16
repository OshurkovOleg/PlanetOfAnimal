package ru.javarush.oshurkov.planetofanimal.entity.herbivores;

import ru.javarush.oshurkov.planetofanimal.entity.Herbivores;
import ru.javarush.oshurkov.planetofanimal.util.Randomize;

public class Goat extends Herbivores {

    public int speed = 3;
    public int direction = Randomize.getRandomNumber(4);
    public boolean isDone = false;

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        return "Goat";
    }
}
