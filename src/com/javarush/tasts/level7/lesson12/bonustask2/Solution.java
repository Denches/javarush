package com.javarush.tasts.level7.lesson12.bonustask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
 * Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
 * Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
 * Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
 * Программа выводит содержимое нового списка на экран.
 *
 * Пример ввода:
 * Кот
 * Коты
 * Я
 * Пример вывода:
 * Кот Кот Кот
 * Коты Коты
 * Я Я Я
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        StringBuilder newStr = new StringBuilder();

        while (true) {

            String string = reader.readLine();
            if (string.isEmpty()) break;
            list.add(string);
        }

        List<String> newList = new ArrayList<>();

        for (String s : list) {

            if (s.length() % 2 == 0) {

                for (int j = 0; j < 2; j++) {
                    newStr.append(s).append(" ");
                }
            } else {
                for (int j = 0; j < 3; j++) {
                    newStr.append(s).append(" ");
                }
            }
            newList.add(newStr.toString());
            newStr = new StringBuilder();
        }

        newList.forEach(System.out::println);
    }
}
