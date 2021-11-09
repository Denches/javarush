package com.javarush.tasts.level10.lesson11.task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Ввести с клавиатуры в список 20 слов. Нужно подсчитать количество одинаковых слов в списке.
 * Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
 * а второй – число, сколько раз данная строка встречалась в списке. Вывести содержимое словаря на экран.
 *
 * В тестах регистр (большая/маленькая буква) не влияет на результат.
 */

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 20; i++) {

            String str = reader.readLine();

            list.add(str.toLowerCase(Locale.ROOT));

            for (String s : list){

                if (map.containsKey(s)) {
                    map.replace(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();

            System.out.println(key + " - " + value);
        }
    }
}
