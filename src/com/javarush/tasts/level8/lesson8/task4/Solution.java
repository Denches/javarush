package com.javarush.tasts.level8.lesson8.task4;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
 * Удалить из словаря всех людей, родившихся летом.
 */

public class Solution {

    public static void main(String[] args) {

        Map<String, Date> map = createMap();

        removeAllSummerPeople(map);

        for (Map.Entry<String, Date> pair : map.entrySet()){

            System.out.println(pair.getKey() +" - " + pair.getValue());
        }
    }

    public static Map<String, Date> createMap()
    {
        Map<String, Date> map = new HashMap<>();

        map.put("Иванов", new Date("MARCH 15 1999"));
        map.put("Колов", new Date("JULY 3 2000"));
        map.put("Александр", new Date("FEBRUARY 5 1990"));
        map.put("Петров", new Date("AUGUST 8 1200"));
        map.put("Серов", new Date("FEBRUARY 28 1977"));
        map.put("Портов", new Date("JUNE 13 2000"));
        map.put("Топалов", new Date("APRIL 11 2010"));
        map.put("Копалов",new Date("JULY 22 2000"));
        map.put("Шолохов", new Date("AUGUST 28 1995"));
        map.put("Воронов", new Date("OCTOBER 14 1992"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {

            int month = iterator.next().getValue().getMonth() + 1;

            if (month >= 6 && month <= 8) {
                iterator.remove();
            }
        }
    }
}
