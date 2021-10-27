package com.javarush.tasts.level8.lesson8.task2;

import java.util.HashSet;
import java.util.Set;

/**
 * Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
 * Удалить из множества все числа больше 10.
 */

public class Solution {

    public static void main(String[] args) {

        createSet().forEach(System.out::println);
    }

    public static Set<Integer> createSet()
    {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);
        set.add(20);

        set.removeIf(i -> i > 10);

        return set;
    }
}
