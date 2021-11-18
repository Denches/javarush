package com.javarush.tasts.level12.lesson2.task4;

/**
 * Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей:
 * «Кошка», «Собака», «Птица», «Лампа».
 */

public class Solution {

    public static void main(String[] args) {
        definitionOfClass(new Cat());
        definitionOfClass(new Dog());
        definitionOfClass(new Bird());
        definitionOfClass(new Lamp());
    }

    public static void definitionOfClass(Object o){

        if (o instanceof Cat){
            System.out.println("Кошка");
        } else if (o instanceof Dog) {
            System.out.println("Собака");
        }else if (o instanceof Bird) {
            System.out.println("Птица");
        }else if (o instanceof Lamp) {
            System.out.println("Лампа");
        }
    }

    static class Cat
    {
    }

    static class Dog
    {
    }

    static class Bird
    {
    }

    static class Lamp
    {
    }
}
