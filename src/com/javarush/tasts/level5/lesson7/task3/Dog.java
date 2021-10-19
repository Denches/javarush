package com.javarush.tasts.level5.lesson7.task3;

/**
 Создать класс Dog (собака) с тремя инициализаторами:
 - Имя
 - Имя, рост
 - Имя, рост, цвет
 */

class Dog {

    private String name;
    private String color;

    private int height;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, String color, int height) {
        this.name = name;
        this.color = color;
        this.height = height;
    }
}
