package com.javarush.tasts.level12.lesson12.task2;

/**
 *
 */

public class Solution {

    public static void main(String[] args) {
        Pet cat = new Cat();
        cat.setName("Cat");

        System.out.println(cat.getName());
    }

    public static class Pet {
        protected String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Cat extends Pet {
        String s = "Я - кот";

        @Override
        public void setName(String name) {
            super.setName(s);
        }
    }
}
