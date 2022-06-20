package com.javarush.island.oshurkov.repository;

import com.javarush.island.oshurkov.entity.Animal;
import com.javarush.island.oshurkov.entity.Location;
import com.javarush.island.oshurkov.entity.herbivores.Goat;
import com.javarush.island.oshurkov.entity.herbivores.Horse;
import com.javarush.island.oshurkov.entity.plants.Plant;
import com.javarush.island.oshurkov.entity.predators.Bear;
import com.javarush.island.oshurkov.entity.predators.Wolf;
import com.javarush.island.oshurkov.exception.IslandException;
import com.javarush.island.oshurkov.util.Randomize;
import com.javarush.island.oshurkov.util.Type;

import static com.javarush.island.oshurkov.entity.Island.ISLAND;

public class IslandCreator {

    public void fillIsland(Location[][] island) {
        for (int i = 0; i < ISLAND.length; i++) {
            ISLAND[i][0] = new Location();
            for (int j = 1; j < ISLAND[i].length; j++) {
                ISLAND[i][j] = new Location();
            }
        }
    }

    public void populateTheIsland(int amount) {
        int count = 0;
        int number = ISLAND.length;
        while (count < amount) {
            int rows = Randomize.getRandomNumber(number);
            int col =  Randomize.getRandomNumber(number);
            Location location = ISLAND[rows][col];
            location.addOrganism(orderAnimal());
            count++;
        }
    }

    private Animal orderAnimal() {

        int numberAnimal = Randomize.getRandomNumber(Type.values().length);

        return switch (Randomize.getRandomNumber(Type.values().length)) {
            case 0 -> new Goat();
            case 1 -> new Horse();
            case 2 -> new Bear();
            case 3 -> new Wolf();
            default -> throw new IslandException("getHerbivoresAnimal Exception" + numberAnimal);
        };
    }

    private Plant getPlant() {
        return new Plant();
    }
}
