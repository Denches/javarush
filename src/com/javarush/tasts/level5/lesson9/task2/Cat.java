package com.javarush.tasts.level5.lesson9.task2;

/**
 Создать класс Cat (кот) с пятью конструкторами:
 - Имя
 - Имя, вес, возраст
 - Имя, возраст (вес стандартный)
 - вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
 - вес, цвет, адрес (чужой домашний кот)

 Задача конструктора – сделать объект валидным. Например, если вес неизвестен,
 то нужно указать какой-нибудь средний вес. Кот не может ничего не весить.
 То же касательно возраста. А вот имени может и не быть (null).
 То же касается адреса: null.
 */

class Cat {

    private String name = null;
    private String color = null;
    private String address = null;

    private int age;
    private int weight;

    public Cat(String name) {
        this.name = name;
    }
    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }
    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
}
