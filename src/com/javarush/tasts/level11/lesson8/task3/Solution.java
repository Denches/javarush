package com.javarush.tasts.level11.lesson8.task3;

/**
 * Скрыть все внутренние переменные класса Cat, а также методы, позволяющие менять внутреннее состояние объектов класса Cat.
 */

public class Solution {

    public static void main(String[] args) {

    }

    public static class Cat{

        private String name;
        private int age;
        private String gender;

        private String weight;

        public String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        private void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        private void setGender(String gender) {
            this.gender = gender;
        }

        public String getWeight() {
            return weight;
        }

        private void setWeight(String weight) {
            this.weight = weight;
        }
    }
}
