package com.javarush.tasts.level12.lesson2.task3;

/**
 * Переопределить метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота, а собака – собаку.
 */

public class Solution {

    public static void main(String[] args) {

        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();

        System.out.println(cat.getClass());

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();

        System.out.println(dog.getClass());
    }

    static class Pet
    {
        public Pet getChild()
        {
            return new Pet();
        }
    }

    static class Cat extends Pet{
        public Cat getChild(){
            return new Cat();
        }
    }
    static class Dog extends Pet{
        public Dog getChild(){
            return new Dog();
        }
    }
}
