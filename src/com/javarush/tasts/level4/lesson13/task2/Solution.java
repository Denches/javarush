package com.javarush.tasts.level4.lesson13.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    /**
     Ввести с клавиатуры два числа m и n.
     Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

     Пример: m=2, n=4
     8888
     8888
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstNumber = reader.readLine();
        String secondNumber = reader.readLine();

        int m = Integer.parseInt(firstNumber);
        int n = Integer.parseInt(secondNumber);

        for (int i = 0; i < m; i++) {
            for (int k = 0; k < n; k++) {

                System.out.print("8");
            }
            System.out.println();
        }

    }
}
