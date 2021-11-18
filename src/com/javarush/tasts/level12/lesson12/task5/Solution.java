package com.javarush.tasts.level12.lesson12.task5;

/**
 * Напиши метод, который определяет, какой объект передали в него.
 * Программа должна выводить на экран одну из надписей:
 * «Кот», «Тигр», «Лев», «Бык», «Корова», «Животное».
 *
 * Замечание: постарайся определять тип животного как можно более точно.
 */

public class Solution {

    public static void main(String[] args) {
        definitionIfClass(new Cat());
        definitionIfClass(new Tiger());
        definitionIfClass(new Lion());
        definitionIfClass(new Bull());
        definitionIfClass(new Cow());
        definitionIfClass(new Animal());
    }

    static void definitionIfClass(Object o){
        if (o instanceof Cat){
            System.out.println("Кот");
        } else if (o instanceof Tiger){
            System.out.println("Тигр");
        }else if (o instanceof Lion){
            System.out.println("Лев");
        }else if (o instanceof Bull){
            System.out.println("Бык");
        }else if (o instanceof Cow){
            System.out.println("Корова");
        }else if (o instanceof Animal){
            System.out.println("Животное");
        }
    }

    static class Cat extends Animal{}
    static class Tiger extends Animal{}
    static class Lion extends Animal{}
    static class Bull extends Animal{}
    static class Cow extends Animal{}
    static class Animal{}
}
