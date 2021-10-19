package com.javarush.tasts.level4.lesson16.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    /**
     Ввести с клавиатуры три числа, вывести на экран среднее из них,
     т.е. не самое большое и не самое маленькое.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sFirstNumber = reader.readLine();
        String sSecondNumber = reader.readLine();
        String sThirdNumber= reader.readLine();

        int firstNumber = Integer.parseInt(sFirstNumber);
        int secondNumber = Integer.parseInt(sSecondNumber);
        int thirdNumber = Integer.parseInt(sThirdNumber);

        int mid;

        if (firstNumber < secondNumber && firstNumber < thirdNumber){

            if (secondNumber > thirdNumber){
                mid = thirdNumber;
            }else {
                mid = secondNumber;
            }

        }else if (secondNumber < firstNumber && secondNumber < thirdNumber){
            if (firstNumber > thirdNumber){
                mid = thirdNumber;
            }else {
                mid = secondNumber;
            }
        }else {
            if (firstNumber > secondNumber){
                mid = secondNumber;
            }else {
                mid = firstNumber;
            }
        }

        System.out.println(mid);
    }
}
