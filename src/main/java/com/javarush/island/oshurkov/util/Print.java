package com.javarush.island.oshurkov.util;

import com.javarush.island.oshurkov.entity.Location;
import com.javarush.island.oshurkov.entity.Organism;

import java.util.List;

public class Print {

    public static void printMap(Location[][] local) {
        int numberLocal = 1;
        for (int i = 0; i < local.length; i++) {
            List<Organism> organisms = local[i][0].getOrganisms();
            System.out.println("Локация: " + numberLocal++);
            if (organisms.size() == 0) {
                System.out.println("Пусто");
            }
            organisms.forEach(System.out::println);

            System.out.println();

            for (int j = 1; j < local[i].length; j++) {
                List<Organism> organisms2 = local[i][0].getOrganisms();
                System.out.println("Локация: " + numberLocal++);
                if (organisms2.size() == 0) {
                    System.out.println("Пусто");
                }
                organisms2.forEach(System.out::println);
                System.out.println();
            }

        }
    }


}
