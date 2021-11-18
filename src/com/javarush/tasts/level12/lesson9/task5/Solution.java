package com.javarush.tasts.level12.lesson9.task5;

/**
 * Напиши public класс Human(человек) и public интерфейсы Run(бежать/ездить), Swim(плавать).
 * Добавь в каждый интерфейс по одному методу.
 * Добавь эти интерфейсы классу Human, но не реализуй методы.
 * Объяви класс Human абстрактным.
 */

public class Solution {

    public static void main(String[] args) {

    }

    public static abstract class Human implements Run, Swim{
    }

    public interface Run{
        void run();
    }
    public interface Swim{
        void swim();
    }
}
