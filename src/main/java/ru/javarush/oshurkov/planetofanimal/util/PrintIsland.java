package ru.javarush.oshurkov.planetofanimal.util;

import ru.javarush.oshurkov.planetofanimal.entity.Location;

public class PrintIsland {

    public static void printAllLocation(Location[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][0] + " ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
                System.out.println();

        }
    }


}
