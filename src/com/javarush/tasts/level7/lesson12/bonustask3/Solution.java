package com.javarush.tasts.level7.lesson12.bonustask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Программа вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            String string = reader.readLine();
            Integer number = Integer.parseInt(string);

            list.add(number);
        }

        Collections.reverse(list);
        list.forEach(System.out::println);
    }
}
