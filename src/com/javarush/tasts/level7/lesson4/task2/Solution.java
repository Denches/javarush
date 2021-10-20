package com.javarush.tasts.level7.lesson4.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Создать массив на 10 строчек.
 * 2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
 * 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        String[] str = new String[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 8; i++) {

            String string = reader.readLine();

            str[i] = string;
        }

        for (int i = str.length - 1; i >= 0; i--) {
            System.out.println(str[i]);
        }
    }
}
