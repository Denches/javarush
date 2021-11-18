package com.javarush.tasts.level12.lesson6.task5;

/**
 * Унаследуй классы Cat и Dog от Pet.
 * Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.
 */

public class Solution {

    public static void main(String[] args) {

        Pet cat = new Cat();
        cat.voice();
        Pet dog = new Dog();
        dog.voice();
    }

    public abstract static class Pet{
        public abstract void voice();
    }
    public static class Cat extends Pet{

        @Override
        public void voice() {
            System.out.println("May");
        }
    }
    public static class Dog extends Pet{

        @Override
        public void voice() {
            System.out.println("Gaf");
        }
    }
}
