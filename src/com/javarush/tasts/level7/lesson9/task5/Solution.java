package com.javarush.tasts.level7.lesson9.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *  1. Введи с клавиатуры 10 слов в список строк.
 * 2. Метод doubleValues должен удваивать слова по принципу a,b,c → a,a,b,b,c,c.
 * 3. Используя цикл for, выведи результат на экран, каждое значение с новой строки.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            String str = reader.readLine();
            list.add(str);
        }

        doubleValues(list);

        list.forEach(System.out::println);
    }

    public static void doubleValues(List<String> list){

        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.get(i));
            i++;
        }

    }
}
