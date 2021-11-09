package com.javarush.tasts.level10.lesson11.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита). Вывести результат на экран.
 *
 * Пример вывода:
 * а 5
 * б 8
 * в 3
 * г 7
 * …
 * я 9
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {

            String str = reader.readLine();
            String[] arr = str.split("");
            List<String> list = new ArrayList<>(Arrays.asList(arr));

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
