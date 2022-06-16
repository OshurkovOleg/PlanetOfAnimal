package ru.javarush.oshurkov.planetofanimal.entity.predators;

import ru.javarush.oshurkov.planetofanimal.entity.Predators;
import ru.javarush.oshurkov.planetofanimal.util.Randomize;

public class Bear extends Predators {

    public int speed = 2;
    public int direction = Randomize.getRandomNumber(4);
    public boolean isDone = false;

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        return "Bear";
    }
}
