package com.javarush.tasts.level11.lesson8.task4;

/**
 * 
 */

public class Solution {

    public static void main(String[] args) {

    }

    public static class Cat
    {
        private String name;
        private int speed;

        public Cat(String name, int speed)
        {
            this.name = name;
            this.speed = speed;
        }

        private String getName()
        {
            return name;
        }

        private int getSpeed()
        {
            return speed;
        }

        public boolean isDogNear(Dog dog)
        {
            return this.speed > dog.getSpeed();
        }
    }

    public static  class Dog
    {
        private String name;
        private int speed;

        public Dog(String name, int speed)
        {
            this.name = name;
            this.speed = speed;
        }

        private String getName()
        {
            return name;
        }

        private int getSpeed()
        {
            return speed;
        }

        public boolean isCatNear(Cat cat)
        {
            return this.speed > cat.getSpeed();
        }
    }
}
