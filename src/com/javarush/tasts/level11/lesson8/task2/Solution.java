package com.javarush.tasts.level11.lesson8.task2;

/**
 * Скрыть все внутренние переменные класса Cat, но только те, к которым остается доступ с помощью методов.
 */

public class Solution {

    public static void main(String[] args) {

    }

    public static class Cat{

        private String name;
        private int age;
        private String gender;

        public String weight;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }
}
