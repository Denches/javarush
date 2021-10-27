package com.javarush.tasts.level8.lesson8.task5;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
 * Удалить людей, имеющих одинаковые имена.
 */

public class Solution {

    public static void main(String[] args) {

        HashMap<String, String> map = createMap();

        removeTheFirstNameDuplicates(map);

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
        map.put("Топалов", "Игорь");
        map.put("Копалов", "Олег");
        map.put("Шолохов", "Иван");
        map.put("Воронов", "Михаил");

        return map;
    }
    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, String> pair = iterator.next();

            String name = pair.getValue();

            map.replace(pair.getKey(), "");

            if (map.containsValue(name)){

                map.replace(pair.getKey(),name);
                removeItemFromMapByValue(map, name);

                iterator = map.entrySet().iterator();
            }

            map.replace(pair.getKey(),name);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {

        var copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }

    }

}
