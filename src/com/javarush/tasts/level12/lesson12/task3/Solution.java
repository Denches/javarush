package com.javarush.tasts.level12.lesson12.task3;

/**
 * Добавь один метод в класс Cat так, чтобы программа ничего не выводила на экран.
 */

public class Solution {

    public static void main(String[] args) {

        Pet cat = new Cat();

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
        String s = "";
        @Override
        public String getName() {
            return s;
        }
    }
}
