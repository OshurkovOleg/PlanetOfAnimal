package ru.javarush.oshurkov.planetofanimal.entity.herbivores;

import ru.javarush.oshurkov.planetofanimal.entity.Herbivores;
import ru.javarush.oshurkov.planetofanimal.util.Randomize;

public class Horse extends Herbivores {

    public int speed = 4;
    public int direction = Randomize.getRandomNumber(4);
    public boolean isDone = false;

    public boolean getDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }

    @Override
    public void move() {
    }

    @Override
    public String toString() {
        return "Horse";
    }
}
