package com.javarush.tasts.level12.lesson12.task6;

/**
 * 1) Внутри класса Solution создай интерфейс public interface Fly(летать) с методом void fly()
 * 2) Внутри класса Solution создай интерфейс public interface Climb(лазить по деревьям) с методом void climb()
 * 3) Внутри класса Solution создай интерфейс public interface Run(бегать) с методом void run()
 * 4) Подумай логически, какие именно интерфейсы нужно добавить для каждого класса
 * 5) Добавь интерфейсы классам Cat(кот), Dog(собака), Tiger(тигр), Duck(Утка).
 */

public class Solution {

    public static void main(String[] args) {

    }

    static class Cat implements Climb,Run{
        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }
    static class Dog implements Run{
        @Override
        public void run() {

        }
    }
    static class Tiger implements Run, Climb{
        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }
    static class Duck implements Run, Fly{
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }

    public interface Fly{
        void fly();
    }
    public interface Climb{
        void climb();
    }
    public interface Run{
        void run();
    }
}
