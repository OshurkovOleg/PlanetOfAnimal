package ru.javarush.oshurkov.planetofanimal.util;

import ru.javarush.oshurkov.planetofanimal.entity.Herbivores;
import ru.javarush.oshurkov.planetofanimal.entity.Map;
import ru.javarush.oshurkov.planetofanimal.exception.IslandException;

import java.lang.reflect.Field;
import java.util.List;

public class MovingHerb {

    public static void moveHerb() {
        for (int i = 0; i < Map.ISLAND.length; i++) {

            for (int j = 0; j < Map.ISLAND[i].length - 1; j++) {

                if (Map.ISLAND[i][j].getHerbivores().size() != 0) {

                    List<Herbivores> list = Map.ISLAND[i][j].getHerbivores();

                    for (Herbivores herbivores : list) {
                        int speed;
                        int direction;


                        Class<?> animal = herbivores.getClass();
                        try {
                            Field valueFieldSpeed = animal.getField("speed");
                            Field valueFieldDirection = animal.getField("direction");
                            Field valueFieldIsDone = animal.getField("isDone");

                            speed = valueFieldSpeed.getInt(herbivores);
                            direction = valueFieldDirection.getInt(herbivores);

                            if (valueFieldIsDone.getBoolean(herbivores)) {
                                continue;
                            }
                            valueFieldIsDone.set(herbivores, true);

                        } catch (NoSuchFieldException | IllegalAccessException e) {
                            throw new IslandException("Ошибка при получии поля скорости передвижения" + e);
                        }

                        try {

                            if (direction == 0) {
                                List<Herbivores> rightHerbivores = Map.ISLAND[i][j + speed].getHerbivores();
                                rightHerbivores.add(herbivores);
                                list.remove(herbivores);

                            }

                            if (direction == 1) {
                                List<Herbivores> leftHerbivores = Map.ISLAND[i][j - speed].getHerbivores();
                                leftHerbivores.add(herbivores);
                                list.remove(herbivores);
                            }

                            if (direction == 2) {
                                List<Herbivores> leftHerbivores = Map.ISLAND[i - speed][j].getHerbivores();
                                leftHerbivores.add(herbivores);
                                list.remove(herbivores);
                            }

                            if (direction == 3) {
                                List<Herbivores> leftHerbivores = Map.ISLAND[i + speed][j].getHerbivores();
                                leftHerbivores.add(herbivores);
                                list.remove(herbivores);
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
