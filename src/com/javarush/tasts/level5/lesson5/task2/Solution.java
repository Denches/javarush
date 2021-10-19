package com.javarush.tasts.level5.lesson5.task2;

import com.javarush.tasts.level5.lesson5.task1.Cat;

public class Solution {

    /**
     Реализовать метод boolean fight(Cat anotherCat): реализовать механизм драки котов в зависимости от их веса,
     возраста и силы. Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
     т.е. возвращать true, если выиграли и false - если нет.
     Должно выполняться условие:
     если cat1.fight(cat2) == true , то cat2.fight(cat1) == false
     */

    public static void main(String[] args) {

        Cat cat1 = new Cat("Cat1", 10,10, 10);
        Cat cat2 = new Cat("Cat2", 20,20, 20);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
