package ru.javarush.oshurkov.planetofanimal.util;

import ru.javarush.oshurkov.planetofanimal.entity.Herbivores;
import ru.javarush.oshurkov.planetofanimal.entity.Location;
import ru.javarush.oshurkov.planetofanimal.entity.Plant;
import ru.javarush.oshurkov.planetofanimal.entity.Predators;

import java.util.List;

public class Print {

    public static void printMap(Location[][] local) {
        int numberLocal = 1;
        for (int i = 0; i < local.length; i++) {
            List<Herbivores> herbivores1 = local[i][0].getHerbivores();
            List<Predators> predators1 = local[i][0].getPredators();
            List<Plant> plant1 = local[i][0].getPlants();
            System.out.println("Локация: " + numberLocal++);
            if (herbivores1.size() == 0 && predators1.size() == 0 && plant1.size() == 0) {
                System.out.println("Пусто");
            }
            herbivores1.forEach(System.out::println);
            predators1.forEach(System.out::println);
            plant1.forEach(System.out::println);
            System.out.println();

            for (int j = 1; j < local[i].length; j++) {
                List<Herbivores> herbivores2 = local[i][j].getHerbivores();
                List<Predators> predators2 = local[i][0].getPredators();
                List<Plant> plant2 = local[i][0].getPlants();
                System.out.println("Локация: " + numberLocal++);
                if (herbivores2.size() == 0 && predators2.size() == 0 && plant1.size() == 0) {
                    System.out.println("Пусто");
                }
                herbivores2.forEach(System.out::println);
                predators2.forEach(System.out::println);
                plant1.forEach(System.out::println);
                System.out.println();
            }

        }
    }


}
