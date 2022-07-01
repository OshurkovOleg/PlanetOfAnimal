package ru.javarush.island.oshurkov.entity;

public class Organism{

/*    private final static AtomicLong idCounter = new AtomicLong(System.currentTimeMillis());
    private final long id = idCounter.incrementAndGet();*/


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
