package ru.javarush.oshurkov.planetofanimal;

import ru.javarush.oshurkov.planetofanimal.entity.Map;
import ru.javarush.oshurkov.planetofanimal.util.MovingHerb;
import ru.javarush.oshurkov.planetofanimal.util.MovingPred;
import ru.javarush.oshurkov.planetofanimal.util.Print;

public class Runner {
    public static void main(String[] args) {

        Map map = new Map();
        map.populateTheIsland(2000);
        Print.printMap(Map.ISLAND);
        MovingHerb.moveHerb();
        MovingPred.movePred();
        Print.printMap(Map.ISLAND);


    }
}
