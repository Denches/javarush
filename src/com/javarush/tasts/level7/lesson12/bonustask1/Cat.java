package com.javarush.tasts.level7.lesson12.bonustask1;

public class Cat {

    private String name;

    private int age;
    private int weight;
    private int tail;

    public Cat(String name, int age, int weight, int tail) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.tail = tail;
    }

    @Override
    public String toString()
    {
        return "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tail;
    }
}
