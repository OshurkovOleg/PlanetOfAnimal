package com.javarush.island.oshurkov.util;

import com.javarush.island.oshurkov.entity.Island;
import com.javarush.island.oshurkov.entity.Organism;
import com.javarush.island.oshurkov.exception.IslandException;

import java.lang.reflect.Field;
import java.util.List;

public class MovingOrganism {

    public static void moveHerb() {
        for (int i = 0; i < Island.ISLAND.length; i++) {

            for (int j = 0; j < Island.ISLAND[i].length - 1; j++) {

                if (Island.ISLAND[i][j].getOrganisms().size() != 0) {

                    List<Organism> list = Island.ISLAND[i][j].getOrganisms();

                    for (Organism organism : list) {
                        int speed;
                        int direction;


                        Class<?> animal = organism.getClass();
                        try {
                            Field valueFieldSpeed = animal.getField("speed");
                            Field valueFieldDirection = animal.getField("direction");
                            Field valueFieldIsDone = animal.getField("isDone");

                            speed = valueFieldSpeed.getInt(organism);
                            direction = valueFieldDirection.getInt(organism);

                            if (valueFieldIsDone.getBoolean(organism)) {
                                continue;
                            }
                            valueFieldIsDone.set(organism, true);

                        } catch (NoSuchFieldException | IllegalAccessException e) {
                            throw new IslandException("Ошибка при получии поля скорости передвижения" + e);
                        }

                        try {

                            if (direction == 0) {
                                List<Organism> rightOrganism = Island.ISLAND[i][j + speed].getOrganisms();
                                rightOrganism.add(organism);
                                list.remove(organism);

                            }

                            if (direction == 1) {
                                List<Organism> leftOrganism = Island.ISLAND[i][j - speed].getOrganisms();
                                leftOrganism.add(organism);
                                list.remove(organism);
                            }

                            if (direction == 2) {
                                List<Organism> downOrganism = Island.ISLAND[i - speed][j].getOrganisms();
                                downOrganism.add(organism);
                                list.remove(organism);
                            }

                            if (direction == 3) {
                                List<Organism> upOrganism = Island.ISLAND[i + speed][j].getOrganisms();
                                upOrganism.add(organism);
                                list.remove(organism);
                            }


                        } catch (ArrayIndexOutOfBoundsException e) {
                            continue;
                        }

                    }

                }

            }
        }
    }
}
