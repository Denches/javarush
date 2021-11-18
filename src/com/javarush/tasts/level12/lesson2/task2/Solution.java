package com.javarush.tasts.level12.lesson2.task2;

/**
 * Переопределить метод getName в классе Whale(Кит), чтобы программа ничего не выдавала на экран.
 */

public class Solution {

    public static void main(String[] args) {

        Whale whale = new Whale();
        System.out.println(whale.getName());
    }

    static class Whale extends Cow {
        public String name;

        public String getName() {
            return "";
        }
    }
    static class Cow{
        public String name;

        public String getName() {
            return "я - корова";
        }
    }
}
