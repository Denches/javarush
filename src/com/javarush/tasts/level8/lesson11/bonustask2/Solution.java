package com.javarush.tasts.level8.lesson11.bonustask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
 * Новая задача: Программа должна работать не с номерами домов, а с городами:
 *
 * Пример ввода:
 * Москва
 * Ивановы
 * Киев
 * Петровы
 * Лондон
 * Абрамовичи
 * Лондон
 *
 * Пример вывода:
 * Абрамовичи
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String,String> map = new HashMap<>();

        while (true){

            String str = reader.readLine();
            String str2 = reader.readLine();

            if (str.isEmpty()) break;

            for (Map.Entry<String, String> pair : map.entrySet()) {
                String key = pair.getKey();
                String value = pair.getValue();

                if (key.equals(str)) {
                    System.out.println(value);
                }
            }

            map.put(str,str2);
        }
    }
}
