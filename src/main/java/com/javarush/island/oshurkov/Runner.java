package com.javarush.island.oshurkov;

import com.javarush.island.oshurkov.entity.Island;
import com.javarush.island.oshurkov.repository.IslandCreator;
import com.javarush.island.oshurkov.util.Print;

public class Runner {
    public static void main(String[] args) {
        IslandCreator islandCreator = new IslandCreator();
        islandCreator.fillIsland(Island.ISLAND);
        islandCreator.populateTheIsland(200);
        Print.printMap(Island.ISLAND);

    }
}
