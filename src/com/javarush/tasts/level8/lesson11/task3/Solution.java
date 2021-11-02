package com.javarush.tasts.level8.lesson11.task3;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя». 2. Пусть среди этих 10 человек есть люди с одинаковыми именами и/или фамилиями.
 * 2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
 * 3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
 * 4. Вывести содержимое Map на экран.
 */

public class Solution {

    public static void main(String[] args) {

        Map<String, String> map = createMap();

        map.forEach((key, value) -> System.out.println(key + " - " + value));
    }

    public static HashMap <String, String> createMap() {

        var map = new HashMap<String, String>();

        map.put("Иванов", "Иван");
        map.put("Колов", "Артем");
        map.put("Александр", "Александр");
        map.put("Петров", "Петр");
        map.put("Серов", "Игорь");
        map.put("Портов", "Олег");
        map.put("Портов", "Игорь");
        map.put("Копалов", "Олег");
        map.put("Шолохов", "Иван");
        map.put("Воронов", "Михаил");

        return map;
    }
}
