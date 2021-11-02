package com.javarush.tasts.level8.lesson11.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Написать программу, которая вводит с клавиатуры строку текста.
 * Программа заменяет в тексте первые буквы всех слов на заглавные.
 * Вывести результат на экран.
 *
 * Пример ввода:
 * мама мыла раму.
 * Пример вывода:
 * Мама Мыла Раму.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();

        while (true) {

            String string = reader.readLine();
            if (string.isEmpty()) break;
            list.add(string);
        }

        for (String s : list){

            System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
        }

    }
}
