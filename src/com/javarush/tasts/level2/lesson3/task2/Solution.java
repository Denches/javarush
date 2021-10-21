package com.javarush.tasts.level2.lesson3.task2;

/**
 * Создать 3 объекта типа Dog (собака) и присвоить им имена "Max", "Bella", "Jack".
 */

public class Solution {

    public static void main(String[] args) {

        Dog max = new Dog("Max");
        Dog bella = new Dog("Bella");
        Dog jack = new Dog("Jack");
    }

    static class Dog{

        private String name;

        public Dog(String name) {
            this.name = name;
        }
    }
}