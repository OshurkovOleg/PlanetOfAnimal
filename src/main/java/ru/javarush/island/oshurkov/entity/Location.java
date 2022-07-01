package ru.javarush.island.oshurkov.entity;


import ru.javarush.island.oshurkov.repository.Type;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Location {

    private int row;
    private int col;

    public Location(int row, int col) {
        this.row = row;
        this.col = col;
    }


    private final Map<Type, Set<Organism>> location = new HashMap<>();





    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Map<Type, Set<Organism>> getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "location= " + row + "|" + col;
    }
}