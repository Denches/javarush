package com.javarush.tasts.level12.lesson2.task5;

/**
 * Написать метод, который определяет, объект какого класса ему передали,
 * и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
 */

public class Solution {

    public static void main(String[] args) {
        definitionOfClass(new Cow());
        definitionOfClass(new Dog());
        definitionOfClass(new Whale());
        definitionOfClass(new Object());
    }

    public static void definitionOfClass(Object o){

        if (o instanceof Cow){
            System.out.println("Корова");
        } else if (o instanceof Dog) {
            System.out.println("Собака");
        }else if (o instanceof Whale) {
            System.out.println("Кит");
        }else {
            System.out.println("Неизвестное животное");
        }
    }

    static class Cow
    {
    }

    static class Whale
    {
    }

    static class Dog
    {
    }
}
