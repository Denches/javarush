package com.javarush.tasts.level5.lesson12.bonustask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sNumber;

        int min = Integer.MAX_VALUE;
        int number;

        for (int i = 0; i < 5; i++) {

            sNumber = reader.readLine();

            number = Integer.parseInt(sNumber);

            if (number < min)
                min = number;
        }

        System.out.println(min);
    }
}
