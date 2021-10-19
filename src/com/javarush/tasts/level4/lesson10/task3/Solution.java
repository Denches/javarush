package com.javarush.tasts.level4.lesson10.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    /**
     Ввести с клавиатуры строку и число N.
     Вывести на экран строку N раз, используя цикл while.

     Пример ввода:
     абв
     2
     Пример вывода:
     абв
     абв
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = reader.readLine();
        String sNumber= reader.readLine();

        int n = Integer.parseInt(sNumber);
        int i = 0;
        while (i < n){
            System.out.println(string);
            i++;
        }
    }
}
