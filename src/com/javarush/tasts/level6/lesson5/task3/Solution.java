package com.javarush.tasts.level6.lesson5.task3;

import com.javarush.tasts.level6.lesson5.task2.Cat;
import com.javarush.tasts.level6.lesson5.task2.Dog;

/**
 * Создать в цикле по 50 000 объектов Cat и Dog.
 * (Java-машина должна начать уничтожать неиспользуемые,
 * и метод finalize хоть раз да вызовется).
 */

public class Solution {

    public static void main(String[] args) {

        Cat[] cats = new Cat[50000];
        Dog[] dogs = new Dog[50000];

        for (int i = 0; i < 50000; i++) {

            cats[i] = new Cat();
            dogs[i] = new Dog();
        }
    }
}
