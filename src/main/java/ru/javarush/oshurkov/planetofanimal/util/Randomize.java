package ru.javarush.oshurkov.planetofanimal.util;

import java.util.concurrent.ThreadLocalRandom;

public class Randomize {

    public static int getRandomNumberUpToHundred() {
        return ThreadLocalRandom.current().nextInt(0, 100);
    }

}
