package com.javarush.tasts.level12.lesson12.task4;

/**
 * Напиши метод, который определяет, какой объект передали в него.
 * Программа должна выводить на экран одну из надписей:
 * «Кот», «Тигр», «Лев», «Бык», «хз».
 */

public class Solution {

    public static void main(String[] args) {
        definitionIfClass(new Cat());
        definitionIfClass(new Tiger());
        definitionIfClass(new Lion());
        definitionIfClass(new Bull());
        definitionIfClass(new Object());
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
        }else {
            System.out.println("хз");
        }
    }

    static class Cat{}
    static class Tiger{}
    static class Lion{}
    static class Bull{}
}
