package com.javarush.tasts.level10.lesson11.bonustask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
 * Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
 * Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
 * Затем программа выводит содержание HashMap на экран
 *
 * Пример ввода:
 * 1
 * Мама
 * 2
 * Рама
 *
 * Пример вывода:
 * 1 Мама
 * 2 Рама
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String,Integer> map = new HashMap<>();

        while(true){

            String str = reader.readLine();
            String str2 = reader.readLine();

            if (str.equals("")) break;

            int value = Integer.parseInt(str);

            if (map.containsKey(str2)) {

            } else {
                map.put(str2, value);
            }
        }

        for (Map.Entry<String,Integer> pair : map.entrySet()){

            String key = pair.getKey();
            Integer value = pair.getValue();

            System.out.println(value + " - " + key);
        }
    }
}
