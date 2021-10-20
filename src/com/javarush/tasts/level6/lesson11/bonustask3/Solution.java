package com.javarush.tasts.level6.lesson11.bonustask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Программа вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
 *
 * Пример ввода:
 * 3
 * 2
 * 15
 * 6
 * 17
 * Пример вывода:
 * 2
 * 3
 * 6
 * 15
 * 17
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            String sNumber = reader.readLine();

            list.add(Integer.parseInt(sNumber));
        }

        Collections.sort(list);

        for(Integer number : list){

            System.out.println(number);
        }
    }
}
