package com.javarush.tasts.level6.lesson11.bonustask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Программа вводит два числа с клавиатуры и выводит их максимум в виде «Max is 25».
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sFirstNumber = reader.readLine();
        String sSecondNumber = reader.readLine();

        int firstNumber = Integer.parseInt(sFirstNumber);
        int secondNumber = Integer.parseInt(sSecondNumber);

        int max = Math.max(firstNumber,secondNumber);

        System.out.println("Max is " + max);
    }
}
