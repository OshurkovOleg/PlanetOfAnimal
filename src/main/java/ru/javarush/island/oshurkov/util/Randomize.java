package ru.javarush.island.oshurkov.util;

import java.util.concurrent.ThreadLocalRandom;

public class Randomize {

    public static int getRandomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
     public static int getRandomNumber(int max) {
        return ThreadLocalRandom.current().nextInt(0, max);
    }
     public static int getRandomDirection() {
        return ThreadLocalRandom.current().nextInt(0, 4);
    }

}
