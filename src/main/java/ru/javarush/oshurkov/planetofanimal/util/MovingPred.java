package ru.javarush.oshurkov.planetofanimal.util;

import ru.javarush.oshurkov.planetofanimal.entity.Herbivores;
import ru.javarush.oshurkov.planetofanimal.entity.Map;
import ru.javarush.oshurkov.planetofanimal.entity.Predators;
import ru.javarush.oshurkov.planetofanimal.exception.IslandException;

import java.lang.reflect.Field;
import java.util.List;

public class MovingPred {

    public static void movePred() {
        for (int i = 0; i < Map.ISLAND.length; i++) {

            for (int j = 0; j < Map.ISLAND[i].length - 1; j++) {

                if (Map.ISLAND[i][j].getPredators().size() != 0) {

                    List<Predators> list = Map.ISLAND[i][j].getPredators();

                    for (Predators predators : list) {
                        int speed;
                        int direction;


                        Class<?> animal = predators.getClass();
                        try {
                            Field valueFieldSpeed = animal.getField("speed");
                            Field valueFieldDirection = animal.getField("direction");
                            Field valueFieldIsDone = animal.getField("isDone");

                            speed = valueFieldSpeed.getInt(predators);
                            direction = valueFieldDirection.getInt(predators);

                            if (valueFieldIsDone.getBoolean(predators)) {
                                continue;
                            }
                            valueFieldIsDone.set(predators, true);

                        } catch (NoSuchFieldException | IllegalAccessException e) {
                            throw new IslandException("Ошибка при получии поля скорости передвижения" + e);
                        }

                        try {

                            if (direction == 0) {
                                List<Predators> rightHerbivores = Map.ISLAND[i][j + speed].getPredators();
                                rightHerbivores.add(predators);
                                list.remove(predators);

                            }

                            if (direction == 1) {
                                List<Predators> leftHerbivores = Map.ISLAND[i][j - speed].getPredators();
                                leftHerbivores.add(predators);
                                list.remove(predators);
                            }

                            if (direction == 2) {
                                List<Predators> leftHerbivores = Map.ISLAND[i - speed][j].getPredators();
                                leftHerbivores.add(predators);
                                list.remove(predators);
                            }

                            if (direction == 3) {
                                List<Predators> leftHerbivores = Map.ISLAND[i + speed][j].getPredators();
                                leftHerbivores.add(predators);
                                list.remove(predators);
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
