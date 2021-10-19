package com.javarush.tasts.level5.lesson9.task3;

/**
 Создать класс Dog (собака) с тремя конструкторами:
 - Имя
 - Имя, рост
 - Имя, рост, цвет
 */

class Dog {

    private String name;
    private String color;

    private int height;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Dog(String name, String color, int height) {
        this.name = name;
        this.color = color;
        this.height = height;
    }
}
