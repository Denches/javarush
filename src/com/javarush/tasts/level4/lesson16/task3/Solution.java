package com.javarush.tasts.level4.lesson16.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    /**
     Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1,
     вывести на экран сумму и завершить программу. -1 должно учитываться в сумме.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sNumber;

        int numb;
        int sum = 0;

        do{
            sNumber = reader.readLine();
            numb = Integer.parseInt(sNumber);

            sum += numb;

        }while (numb != -1);

        System.out.println(sum);

    }
}
