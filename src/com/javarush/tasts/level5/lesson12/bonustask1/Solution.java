package com.javarush.tasts.level5.lesson12.bonustask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 Программа вводит два числа с клавиатуры и выводит их сумму на экран.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sFirstNumber = reader.readLine();
        String ssSecondNumber = reader.readLine();

        int firstNumber = Integer.parseInt(sFirstNumber);
        int secondNumber = Integer.parseInt(ssSecondNumber);

        System.out.println(firstNumber + secondNumber);
    }
}
