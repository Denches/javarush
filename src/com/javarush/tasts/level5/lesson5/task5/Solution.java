package com.javarush.tasts.level5.lesson5.task5;

import com.javarush.tasts.level5.lesson5.task1.Cat;

/**
 Создать три кота используя класс Cat.
 Провести три боя попарно между котами.
 Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
 Результат каждого боя вывести на экран.
 */

public class Solution {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Мурзик",10, 10, 10);
        Cat cat2 = new Cat("Рыжик",2,2,2);
        Cat cat3 = new Cat("Мурка",5,5,5);

        System.out.println("cat1 vs cat2: " + cat1.fight(cat2));
        System.out.println("cat1 vs cat3: " + cat1.fight(cat3));
        System.out.println("cat2 vs cat3: " + cat2.fight(cat3));
    }
}
