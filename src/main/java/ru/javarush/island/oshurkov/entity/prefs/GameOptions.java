package ru.javarush.island.oshurkov.entity.prefs;

import ru.javarush.island.oshurkov.repository.Type;

import java.util.HashMap;
import java.util.Map;

public class GameOptions {

    private Map<Type, Fields> options = new HashMap<>();

    private static final GameOptions instance = new GameOptions();

    private GameOptions() {
        initialize();
    }

    private void initialize() {
        options.put(Type.WOLF, (new Fields("Волк", 30, 52, 35, 60, 3)));
        options.put(Type.SNAKE, (new Fields("Змея", 30, 12, 14, 15, 1)));
        options.put(Type.FOX, (new Fields("Лиса", 30, 6.0, 7.2, 8, 2)));
        options.put(Type.BEAR, (new Fields("Медведь", 5, 420, 465, 500, 2)));
        options.put(Type.EAGLE, (new Fields("Орел", 20, 5, 5.5, 6, 3)));
        options.put(Type.HORSE, (new Fields("Лошадь", 20, 340, 380, 400, 4)));
        options.put(Type.DEER, (new Fields("Олень", 20, 250, 274, 300, 4)));
        options.put(Type.RABBIT, (new Fields("Кролик", 150, 1.55, 1.70, 2, 2)));
        options.put(Type.MOUSE, (new Fields("Мышь", 500, 0.04, 0.045, 0.01, 1)));
        options.put(Type.GOAT, (new Fields("Коза", 140, 50, 55, 60, 3)));
        options.put(Type.SHEEP, (new Fields("Овца", 140, 55, 67, 70, 3)));
        options.put(Type.BOAR, (new Fields("Кабан", 50, 350, 395, 400, 2)));
        options.put(Type.BUFFALO, (new Fields("Буйвол", 10, 600, 687, 700, 3)));
        options.put(Type.DUCK, (new Fields("Утка", 200, 0.85, 0.98, 1, 4)));
        options.put(Type.CATERPILLAR, (new Fields("Гусеница", 1000, 0.01, 0.01, 0.01, 0)));
        options.put(Type.PLANT, (new Fields("Растение", 200, 0, 1, 0, 0)));
    }


    public static GameOptions getInstance() {
        return instance;
    }



    @Override
    public String toString() {
        return "GameOptions{" +
                "options=" + options +
                '}';
    }
}
