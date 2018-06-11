package com.example.androiddevelopment.zadatak_termin20.model;

import java.util.List;

public class Filmovi {

    private int id;
    private String name;

    public Filmovi(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}