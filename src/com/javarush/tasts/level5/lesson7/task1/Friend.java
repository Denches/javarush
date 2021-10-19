package com.javarush.tasts.level5.lesson7.task1;

/**
 Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
 - Имя
 - Имя, возраст
 - Имя, возраст, пол
 */

class Friend {

    private String name;
    private String gender;

    private int age;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
