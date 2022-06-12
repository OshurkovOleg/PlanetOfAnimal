package ru.javarush.oshurkov.planetofanimal;

import ru.javarush.oshurkov.planetofanimal.entity.Island;
import ru.javarush.oshurkov.planetofanimal.entity.Location;
import ru.javarush.oshurkov.planetofanimal.entity.herbivores.Goat;
import ru.javarush.oshurkov.planetofanimal.entity.predators.Wolf;
import ru.javarush.oshurkov.planetofanimal.util.Counter;
import ru.javarush.oshurkov.planetofanimal.util.PrintIsland;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        // создали остров в виде массива
        Location[][] island = new Island().getIsland();

        island[5][4] = new Location();
        island[5][4].getHerbivoresAnimals().add(new Goat());
        island[5][4].getHerbivoresAnimals().add(new Goat());
        island[5][4].getHerbivoresAnimals().add(new Goat());
        island[5][4].getPredatorsAnimals().add(new Wolf());
        island[5][4].getPredatorsAnimals().add(new Wolf());

        PrintIsland.printAllLocation(island);
        



    }
}
