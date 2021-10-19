package com.javarush.tasts.level5.lesson12.task3;

/**
 Добавь по три поля в каждый класс, на твой выбор.
 Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.

 Пример:
 Mouse jerryMouse = new Mouse(“Jerry”, 12 (высота, см) , 5 (длина хвоста, см))
 */

public class Solution {

    public static void main(String[] args) {

        Dog infernalSpike = new Dog("Infernal Spike", 100, 40);
        Dog spike = new Dog("Spike", 80, 10);
        Dog tyke = new Dog("Tyke", 40, 5);

        Cat tom = new Cat("Tom", 110, 40);
        Cat toodles = new Cat("Toodles Gallore", 110, 40);
        Cat tim = new Cat("Tim", 60, 10);
        Cat butch = new Cat("Butch ", 110, 40);

    }

    public static class Dog{

        private String name;

        private int height;
        private int tailLength;

        public Dog(String name, int height, int tailLength) {
            this.name = name;
            this.height = height;
            this.tailLength = tailLength;
        }
    }
    public static class Cat{

        private String name;

        private int height;
        private int tailLength;

        public Cat(String name, int height, int tailLength) {
            this.name = name;
            this.height = height;
            this.tailLength = tailLength;
        }
    }
}
