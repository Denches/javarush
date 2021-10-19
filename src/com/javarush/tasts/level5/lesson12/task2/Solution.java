package com.javarush.tasts.level5.lesson12.task2;

public class Solution {

    public static void main(String[] args) {

        Man man1 = new Man("Вася", 20, "ул. Победы");
        Man man2 = new Man("Витя" , 30, "ул. Танкистов");

        System.out.println(man1);
        System.out.println(man2);

        Woman woman1 = new Woman("Маша", 18, "ул. Жикова");
        Woman woman2 = new Woman("Катя", 25, "ул. Ленина");

        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man{

        private String name;
        private String address;

        private int age;

        public Man(String name, int age, String address ) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
    public static class Woman{

        private String name;
        private String address;

        private int age;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
