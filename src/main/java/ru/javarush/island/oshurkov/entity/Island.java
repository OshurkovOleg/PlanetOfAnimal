package ru.javarush.island.oshurkov.entity;


import ru.javarush.island.oshurkov.entity.prefs.Fields;
import ru.javarush.island.oshurkov.entity.prefs.GameOptions;
import ru.javarush.island.oshurkov.repository.Type;
import ru.javarush.island.oshurkov.util.CreateOrganism;
import ru.javarush.island.oshurkov.util.Randomize;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Island {

    public static final Location[][] ISLAND = new Location[10][10];

    public static void fillIsland() {
        for (int i = 0; i < Island.ISLAND.length; i++) {
            for (int j = 0; j < Island.ISLAND[i].length; j++) {
                Island.ISLAND[i][j] = new Location(i, j);
            }
        }
    }

    public static void settleOrganismsOnIsland() {

        GameOptions instance = GameOptions.getInstance();

        for (int i = 0; i < Island.ISLAND.length; i++) {
            for (int j = 0; j <Island.ISLAND[i].length; j++) {


                Map<Type, Set<Organism>> location = Island.ISLAND[i][j].getLocation();

                try {
                Class<?> clazz = instance.getClass();
                Field options = clazz.getDeclaredField("options");

                options.setAccessible(true);

                    Object obj = options.get(GameOptions.getInstance());
                    if (obj instanceof Map<?, ?>) {

                        Map<Type, Fields> option = (Map<Type, Fields>) obj;

                        for (Map.Entry<Type, Fields> typeFieldsEntry : option.entrySet()) {
                            Fields value = typeFieldsEntry.getValue();

                            int amountLocationMax = Randomize.getRandomNumber(value.getAmountLocationMax());
                                Set<Organism> organisms = new HashSet<>();

                            while (amountLocationMax > 0) {
                                organisms.add(CreateOrganism.create(value.getName(), value));
                                amountLocationMax--;
                            }
                            location.put(typeFieldsEntry.getKey(), organisms);
                        }

                        System.out.println();

                    }
                } catch (IllegalAccessException | NoSuchFieldException e) {
                    throw new RuntimeException(e);
                }


            }

            }
        }

}









