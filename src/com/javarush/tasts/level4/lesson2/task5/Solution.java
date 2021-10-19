package com.javarush.tasts.level4.lesson2.task5;

public class Solution {

    /**
     Написать код, который бы подсчитывал количество созданных котов (count)
     и на экран выдавалось правильно их количество.
     */

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        System.out.println("Cats count is " + Cat.count);
    }
}
