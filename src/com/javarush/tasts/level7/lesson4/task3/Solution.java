package com.javarush.tasts.level7.lesson4.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Создать массив на 10 строк.
 * 2. Создать массив на 10 чисел.
 * 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
 * 4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер
 * ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран,
 * каждое значение выводить с новой строки.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        String[] strings = new String[10];
        int[] arr = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < strings.length; i++) {

            String string = reader.readLine();

            strings[i] = string;
            arr[i] = strings[i].length();
        }

        for (int n : arr) {
            System.out.println(n);
        }

    }
}
