package com.javarush.tasts.level6.lesson5.task4;

/**
 * В конструкторе класса Cat [public Cat()] увеличивать счётчик котов
 * (статическую переменную catCount этого же класса) на 1. В методе finalize уменьшать на 1.
 */

public class Cat {

    private static int catCount;

    public Cat(){
        catCount++;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        catCount--;
    }
}
