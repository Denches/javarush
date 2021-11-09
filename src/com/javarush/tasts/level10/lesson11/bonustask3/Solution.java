package com.javarush.tasts.level10.lesson11.bonustask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Задача: Ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
 * Пояснение:
 * Самое минимальное число – 1-е минимальное.
 * Следующее минимальное после него – 2-е минимальное
 *
 * Пример:
 * 1 6 5 7 1 15 63 88
 * Первое минимальное – 1
 * Второе минимальное – 1
 * Третье минимальное – 5
 * Четвертое минимальное – 6
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 30; i++) {

            String sNumber = reader.readLine();

            int number = Integer.parseInt(sNumber);

            list.add(number);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {

            if (i == 10 || i == 11){
                System.out.println(i + "-e минимальное - " + list.get(i));
            }
        }
    }
}
