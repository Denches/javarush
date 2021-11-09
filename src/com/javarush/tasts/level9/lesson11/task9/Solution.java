package com.javarush.tasts.level9.lesson11.task9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Создать класс кот – Cat, с полем «имя» (String).
 * Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
 * Получить из Map множество(Set) всех имен и вывести его на экран.
 */

public class Solution {

    public static void main(String[] args) {

        Map<String, Cat> catMap = new HashMap<>();

        Cat[] cats = new Cat[10];

        for (int i = 0; i < cats.length; i++) {
            Cat cat = new Cat("cat" + (int) (Math.random() * 10));
            catMap.put(cat.name, cat);
        }

        Set<String> set = new HashSet<>();

        for (Map.Entry<String,Cat> pair : catMap.entrySet()){
            String key = pair.getKey();
            set.add(key);
        }
        for (String s : set){
            System.out.println(s);
        }

    }

    public static class Cat{

        public Cat(String name) {
            this.name = name;
        }

        String name;
    }
}
