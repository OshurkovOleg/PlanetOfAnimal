package ru.javarush.oshurkov.planetofanimal.util;

import java.util.concurrent.ThreadLocalRandom;

public class Randomize {

    public static int getRandomNumber() {
        return ThreadLocalRandom.current().nextInt(0, 100);
    }
     public static int getRandomNumber(int max) {
        return ThreadLocalRandom.current().nextInt(0, max);
    }

}
