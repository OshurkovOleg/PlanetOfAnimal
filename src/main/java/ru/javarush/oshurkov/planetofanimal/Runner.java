package ru.javarush.oshurkov.planetofanimal;

import ru.javarush.oshurkov.planetofanimal.util.Randomize;

public class Runner {
    public static void main(String[] args) {
        int test = Randomize.getRandomNumberUpToHundred();
        System.out.println(test);
    }
}
