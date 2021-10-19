package com.javarush.tasts.level6.lesson8.task1;

/**
 * Создать статическую переменную int catCount в классе Cat.
 * Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.
 */

class Cat {

    private static int catCount;

    public Cat(){
        catCount++;
    }
}
