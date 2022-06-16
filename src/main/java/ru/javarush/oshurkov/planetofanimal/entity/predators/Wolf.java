package ru.javarush.oshurkov.planetofanimal.entity.predators;

import ru.javarush.oshurkov.planetofanimal.entity.Predators;
import ru.javarush.oshurkov.planetofanimal.util.Randomize;

public class Wolf extends Predators {

    public int speed = 3;
    public int direction = Randomize.getRandomNumber(4);
    public boolean isDone = false;

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        return "Wolf";
    }
}
