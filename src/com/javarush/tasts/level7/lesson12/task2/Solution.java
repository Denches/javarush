package com.javarush.tasts.level7.lesson12.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Ввести с клавиатуры 2 числа N и M
 * Ввести N строк и заполнить ими список.
 * Переставить M первых строк в конец списка.
 * Вывести список на экран, каждое значение с новой строки.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();

            String str1 = reader.readLine();
            String str2 = reader.readLine();

            Integer n = Integer.parseInt(str1);
            Integer m = Integer.parseInt(str2);

        for (int i = 0; i < n; i++) {
            String str = reader.readLine();
            list.add(str);
        }

        for (int i = 0; i < m; i++) {

            list.add(list.remove(0));
        }

        list.forEach(System.out::println);
    }
}
