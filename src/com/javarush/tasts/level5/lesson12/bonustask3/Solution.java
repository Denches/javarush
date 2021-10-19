package com.javarush.tasts.level5.lesson12.bonustask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 Написать программу, которая:
 1. вводит с консоли число N > 0
 2. потом вводит N чисел с консоли
 3. выводит на экран максимальное из введенных N чисел.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sNumber = reader.readLine();

        int number = Integer.parseInt(sNumber);

        int max = Integer.MIN_VALUE;

        if (number > 0){
            for (int i = 0; i < number; i++) {

                sNumber = reader.readLine();
                int n = Integer.parseInt(sNumber);

                if (n > max)
                    max = n;
            }
            System.out.println(max);
        }

    }
}
