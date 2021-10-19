package com.javarush.tasts.level4.lesson6.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    /**
     Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sFirstNumber = reader.readLine();
        String sSecondNumber = reader.readLine();

        int firstNumber = Integer.parseInt(sFirstNumber);
        int secondNumber = Integer.parseInt(sSecondNumber);

        if (firstNumber > secondNumber){

            System.out.println(firstNumber);

        } else{
            System.out.println(secondNumber);
        }

    }
}
