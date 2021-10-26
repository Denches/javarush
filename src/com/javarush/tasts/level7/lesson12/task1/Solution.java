package com.javarush.tasts.level7.lesson12.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Ввести с клавиатуры 10 чисел и заполнить ими список.
 * Используя цикл for вывести их в обратном порядке.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            String str = reader.readLine();
            Integer number = Integer.parseInt(str);
            list.add(number);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(list.get(i - 1));
        }
    }
}
