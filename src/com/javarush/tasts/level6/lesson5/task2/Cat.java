package com.javarush.tasts.level6.lesson5.task2;

/**
 * В каждом классе Cat и Dog написать метод finalize,
 * который выводит на экран текст о том, что такой-то объект уничтожен.
 */

public class Cat {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Объект Cat уничтожен");
    }
}
