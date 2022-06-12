package ru.javarush.oshurkov.planetofanimal.util;

import ru.javarush.oshurkov.planetofanimal.entity.Herbivores;
import ru.javarush.oshurkov.planetofanimal.entity.Location;
import ru.javarush.oshurkov.planetofanimal.entity.Predators;
import ru.javarush.oshurkov.planetofanimal.entity.herbivores.Goat;
import ru.javarush.oshurkov.planetofanimal.entity.predators.Wolf;

import java.util.ArrayList;
import java.util.List;

public class Counter {

    private static Integer countWolf;
    private static Integer countGoat;

    public static void scoreAnimal(Location location) {

        List<Predators> predators = location.getPredatorsAnimals();
        for (Predators predator : predators) {
            if (predator instanceof Wolf) {
                countWolf++;
            }
        }

        List<Herbivores> herbivores = location.getHerbivoresAnimals();
        for (Herbivores herbivore : herbivores) {
            if (herbivore instanceof Goat) {
                countGoat++;
            }
        }


    }

}
