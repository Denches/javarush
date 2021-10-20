package com.javarush.tasts.level6.lesson11.task1;

/**
 * В классе Cat создай статическую переменную public int catCount.
 * Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat)
 * статическая переменная catCount увеличивается на 1. Создать 10 объектов Cat и вывести значение
 * переменной catCount на экран.
 */

public class Solution {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
        }

        System.out.println(Cat.catCount);
    }
}
