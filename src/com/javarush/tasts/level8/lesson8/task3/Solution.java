package com.javarush.tasts.level8.lesson8.task3;

import java.util.*;

/**
 * Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
 * Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
 */

public class Solution {

    public static void main(String[] args) {

        System.out.println(getCountTheSameFirstName(createMap(),"Иванов"));
        System.out.println(getCountTheSameLastName(createMap(),"Иван"));
    }

    public static Map<String, String> createMap() {

        Map<String, String> map = new HashMap<>();

        map.put("Иванов", "Иван");
        map.put("Колов", "Артем");
        map.put("Александр", "Александр");
        map.put("Петров", "Петр");
        map.put("Серов", "Игорь");
        map.put("Портов", "Олег");
        map.put("Топалов", "Игорь");
        map.put("Копалов", "Олег");
        map.put("Шолохов", "Иван");
        map.put("Воронов", "Михаил");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String firstName){

        int countKey = 0;


        for (HashMap.Entry<String, String> pair : map.entrySet()){

            String key = pair.getKey();

            if (firstName.equals(key)){
                countKey++;
            }
        }

        return countKey;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName){

        int countValue = 0;


        for (HashMap.Entry<String, String> pair : map.entrySet()){

            String value = pair.getValue();

            if (lastName.equals(value)){
                countValue++;
            }
        }

        return countValue;
    }
}
