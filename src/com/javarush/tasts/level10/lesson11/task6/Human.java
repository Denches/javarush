package com.javarush.tasts.level10.lesson11.task6;

/**
 * Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
 */

public class Human {

    private String name;
    private String lastName;
    private int age;
    private String gender;
    private Human mother;
    private Human father;

    public Human(){}

    public Human(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Human(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Human(String name, String lastName, int age, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Human(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String lastName, int age, String gender, Human mother, Human father) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String lastName, Human mother, Human father) {
        this.name = name;
        this.lastName = lastName;
        this.mother = mother;
        this.father = father;
    }

    public Human(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public Human(String name, String lastName, int age, Human mother, Human father) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
