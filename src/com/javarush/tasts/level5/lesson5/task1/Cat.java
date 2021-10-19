package com.javarush.tasts.level5.lesson5.task1;

/**
 Создать класс Cat. У кота должно быть имя (name, String),
 возраст (age, int), вес (weight, int), сила (strength, int).
 */

public class Cat {

    private String name;

    private int age;
    private int weight;
    private int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat){
        return this.weight > anotherCat.weight && this.strength > anotherCat.strength;
    }
}
