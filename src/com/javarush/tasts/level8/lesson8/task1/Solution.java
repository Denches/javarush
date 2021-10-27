package com.javarush.tasts.level8.lesson8.task1;

import java.util.HashSet;
import java.util.Set;

/**
 * Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
 */

public class Solution {

    public static void main(String[] args) {

        createSet().forEach(System.out::println);
    }

    public static Set<String> createSet()
    {
        Set<String> set = new HashSet<>();

        set.add("ла");
        set.add("лб");
        set.add("лв");
        set.add("лг");
        set.add("лд");
        set.add("ле");
        set.add("лж");
        set.add("лз");
        set.add("ли");
        set.add("лй");
        set.add("лк");
        set.add("лм");
        set.add("лл");
        set.add("лн");
        set.add("ло");
        set.add("лп");
        set.add("лр");
        set.add("лс");
        set.add("лт");
        set.add("лу");

        return set;
    }
}
