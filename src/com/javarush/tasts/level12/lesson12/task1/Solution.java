package com.javarush.tasts.level12.lesson12.task1;

/**
 * Переопредели метод getName в классе Cat так, чтобы программа выдавала на экран надпись «Я - кот».
 */

public class Solution {

    public static void main(String[] args) {

        Cat cat = new Cat();
        System.out.println(cat.getName());

    }

    public static class Pet
    {
        public String getName()
        {
            return "Я - пушистик";
        }
    }

    public static class Cat extends Pet
    {
        String s = "Я - кот";
        @Override
        public String getName() {
            return s;
        }
    }
}
