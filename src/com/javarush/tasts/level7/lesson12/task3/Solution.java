package com.javarush.tasts.level7.lesson12.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Создать массив на 20 чисел.
 * Заполнить его числами с клавиатуры.
 * Найти максимальное и минимальное числа в массиве.
 * Вывести на экран максимальное и минимальное числа через пробел.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {

            String str = reader.readLine();
            array[i] = Integer.parseInt(str);

            if (max < array[i]){
                max = array[i];
            }

            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println(max + " " + min);
    }
}
