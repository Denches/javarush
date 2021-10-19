package com.javarush.tasts.level5.lesson12.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 Вводить с клавиатуры числа и считать их сумму,
 пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for (;;){

            String sNumber = reader.readLine();

            if (sNumber.equals("сумма"))
                break;

            sum += Integer.parseInt(sNumber);
        }

        System.out.println(sum);
    }
}
