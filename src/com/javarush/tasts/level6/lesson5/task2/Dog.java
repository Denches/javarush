package com.javarush.tasts.level6.lesson5.task2;

public class Dog {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Объект Dog уничтожен");
    }
}
