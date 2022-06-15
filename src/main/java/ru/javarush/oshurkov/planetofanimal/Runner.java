package ru.javarush.oshurkov.planetofanimal;

import ru.javarush.oshurkov.planetofanimal.entity.Herbivores;
import ru.javarush.oshurkov.planetofanimal.entity.Location;
import ru.javarush.oshurkov.planetofanimal.entity.Map;
import ru.javarush.oshurkov.planetofanimal.entity.herbivores.Horse;
import ru.javarush.oshurkov.planetofanimal.util.Print;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Location[][] map = Map.ISLAND;
        List<Herbivores> herbivoresList = map[0][1].getHerbivores();
        herbivoresList.add(new Horse());
        herbivoresList.add(new Horse());
        herbivoresList.add(new Horse());
        herbivoresList.add(new Horse());
        herbivoresList.add(new Horse());


        // добавили лошадь в клетку

    /*    for (Herbivores herbivore : herbivoresList) {
            if (herbivore instanceof Horse) {
                Horse horse = (Horse) herbivore;
                // нашли в локации лошадь

                if (horse.getDirection() == 1) {
                    List<Herbivores> herbivoresBecide = map[0][2].getHerbivores();
                    herbivoresBecide.add(herbivore);
                    herbivoresList.remove(herbivore);
                }
            }
        }*/


        for (int i = 0; i < Map.ISLAND.length; i++) {

            for (int j = 0; j < Map.ISLAND[i].length - 1 ; j++) {

                if (Map.ISLAND[i][j].getHerbivores().size() != 0) {
                    List<Herbivores> list = Map.ISLAND[i][j].getHerbivores();
                    for (Herbivores herbivores : list) {
                        if (herbivores instanceof Horse) {
                            Horse horse = (Horse) herbivores;

                            if(horse.getDone()){
                                break;
                            }

                            if (horse.getDirection() == 1) {

                                List<Herbivores> rightHerbivores = Map.ISLAND[i][j + 1].getHerbivores();
                                horse.setDone(true);
                                rightHerbivores.add(herbivores);
                                list.remove(herbivores);

                            }

                            if(horse.getDirection() == 0) {
                                List<Herbivores> leftHerbivores = Map.ISLAND[i][j - 1].getHerbivores();
                                horse.setDone(true);
                                leftHerbivores.add(herbivores);
                                list.remove(herbivores);
                            }
                        }

                    }
                }

            }
        }

        Print.printMap(Map.ISLAND);


    }
}
