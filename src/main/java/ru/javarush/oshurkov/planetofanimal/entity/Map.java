package ru.javarush.oshurkov.planetofanimal.entity;


import ru.javarush.oshurkov.planetofanimal.entity.herbivores.Duck;
import ru.javarush.oshurkov.planetofanimal.entity.herbivores.Goat;
import ru.javarush.oshurkov.planetofanimal.entity.herbivores.Horse;
import ru.javarush.oshurkov.planetofanimal.entity.predators.Bear;
import ru.javarush.oshurkov.planetofanimal.entity.predators.Wolf;
import ru.javarush.oshurkov.planetofanimal.exception.IslandException;
import ru.javarush.oshurkov.planetofanimal.util.HerbivoresEnum;
import ru.javarush.oshurkov.planetofanimal.util.PredatorEnum;
import ru.javarush.oshurkov.planetofanimal.util.Randomize;

import java.util.List;

public class Map {

    public final static Location[][] ISLAND = new Location[20][50];

    static {
        for (int i = 0; i < Map.ISLAND.length; i++) {
            Map.ISLAND[i][0] = new Location();
            for (int j = 1; j < Map.ISLAND[i].length; j++) {
                Map.ISLAND[i][j] = new Location();
            }
        }
    }

    public void populateTheIsland(int amount) {
        int count = 0;
        while (count < amount / 3) {
            int point1 = Randomize.getRandomNumber(ISLAND.length);
            int point2 = Randomize.getRandomNumber(ISLAND.length);
            Location location = Map.ISLAND[point1][point2];

            List<Herbivores> herbivores = location.getHerbivores();
            if (herbivores.size() < 1) {
            location.addHerb(getHerbivoresAnimal());
            }


            location.addPred(getPredatorsAnimal());
            location.addPlant(getPlant());
            count++;
        }
    }

    private Herbivores getHerbivoresAnimal() {

        int numberAnimal = Randomize.getRandomNumber(HerbivoresEnum.values().length);

        return switch (numberAnimal) {
            case 0 -> new Duck();
            case 1 -> new Goat();
            case 2 -> new Horse();
            default -> throw new IslandException("getHerbivoresAnimal Exception" + numberAnimal);
        };
    }


    private Predators getPredatorsAnimal() {

        int numberAnimal = Randomize.getRandomNumber(PredatorEnum.values().length);

        return switch (numberAnimal) {
            case 0 -> new Bear();
            case 1 -> new Wolf();
            default -> throw new IslandException("getPredatorsAnimal Exception" + numberAnimal);
        };
    }

    private Plant getPlant() {
        return new Plant();
    }

}
