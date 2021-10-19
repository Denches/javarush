package com.javarush.tasts.level5.lesson9.task1;

/**
 Создать класс Friend (друг) с тремя конструкторами (тремя методами initialize):
 - Имя
 - Имя, возраст
 - Имя, возраст, пол
 */

class Friend {

    private String name;
    private String gender;

    private int age;

    public Friend(String name) {
        this.name = name;
    }

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Friend(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
