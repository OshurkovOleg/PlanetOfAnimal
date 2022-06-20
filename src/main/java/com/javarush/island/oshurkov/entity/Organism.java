package com.javarush.island.oshurkov.entity;

import com.javarush.island.oshurkov.interfaces.Reproducible;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Organism implements Reproducible {

    private final static AtomicLong idCounter = new AtomicLong(System.currentTimeMillis());
    private final long id = idCounter.incrementAndGet();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Organism reproduction() {
        return null;
    }
}
