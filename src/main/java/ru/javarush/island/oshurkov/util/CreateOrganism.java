package ru.javarush.island.oshurkov.util;

import ru.javarush.island.oshurkov.entity.Organism;
import com.javarush.island.oshurkov.entity.herbivores.*;
import ru.javarush.island.oshurkov.entity.plants.Plant;
import com.javarush.island.oshurkov.entity.predators.*;
import ru.javarush.island.oshurkov.entity.prefs.Fields;
import ru.javarush.island.oshurkov.exception.IslandException;
import ru.javarush.island.oshurkov.entity.herbivores.*;
import ru.javarush.island.oshurkov.entity.predators.*;

public class CreateOrganism {

    public static Organism create(String organism, Fields fields) {
        return switch (organism) {
            case "Волк" -> new Wolf(fields);
            case "Змея" -> new Snake(fields);
            case "Лиса" -> new Fox(fields);
            case "Медведь" -> new Bear(fields);
            case "Орел" -> new Eagle(fields);
            case "Лошадь" -> new Horse(fields);
            case "Олень" -> new Deer(fields);
            case "Кролик" -> new Rabbit(fields);
            case "Мышь" -> new Mouse(fields);
            case "Коза" -> new Goat(fields);
            case "Овца" -> new Sheep(fields);
            case "Кабан" -> new Boar(fields);
            case "Буйвол" -> new Buffalo(fields);
            case "Утка" -> new Duck(fields);
            case "Гусеница" -> new Caterpillar(fields);
            case "Растение" -> new Plant(fields);
            default -> throw new IslandException("Тип животног отсутствует" + organism);
        } ;


    }
}
