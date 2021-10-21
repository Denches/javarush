package com.javarush.tasts.level2.lesson5.task3;

/**
 * Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
 * Присвойте каждому животному владельца (owner).
 */

public class Solution {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();

        cat.owner = woman;
        dog.owner = woman;
        fish.owner = woman;
    }

    static class Cat {
        public Woman owner;
    }

    static class Dog {
        public Woman owner;
    }

    static class Fish {
        public Woman owner;
    }

    static class Woman{}
}
