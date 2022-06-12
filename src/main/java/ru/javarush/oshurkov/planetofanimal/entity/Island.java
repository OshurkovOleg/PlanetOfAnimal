package ru.javarush.oshurkov.planetofanimal.entity;


import java.util.Arrays;

public class Island {

    private final Location[][] island = new Location[10][10];

    public Location[][] getIsland() {
        return island;
    }

    @Override
    public String toString() {
        return "Island{" +
                "island=" + Arrays.toString(island) +
                '}';
    }
}
