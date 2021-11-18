package com.javarush.tasts.level12.lesson2.task1;

/**
 * Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:
 * Я не корова, Я – кит.
 */

public class Solution {

    public static void main(String[] args) {

        Whale whale = new Whale();
        System.out.println(whale.getName());
    }

    static class Whale extends Cow{
        public String name;

        public String getName() {
            return "Я не корова, я – кит";
        }
    }
    static class Cow{
        public String name;

        public String getName() {
            return "я - корова";
        }
    }
}
