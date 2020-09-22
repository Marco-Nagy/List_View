package com.example.listview2;

public class Animal {
    private String name;
    private int pictures;
    private int sound;

    public String getName() {
        return name;
    }

    public int getSound() {
        return sound;
    }

    public int getPictures() {
        return pictures;
    }

    public Animal(String name, int pictures, int sound) {
        this.name = name;
        this.pictures = pictures;
        this.sound = sound;
    }
}
