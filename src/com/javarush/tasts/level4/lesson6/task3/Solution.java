package com.javarush.tasts.level4.lesson6.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    /**
     Ввести с клавиатуры три числа, и вывести их в порядке убывания.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sFirstNumber = reader.readLine();
        String sSecondNumber = reader.readLine();
        String sThirdNumber= reader.readLine();

        int firstNumber = Integer.parseInt(sFirstNumber);
        int secondNumber = Integer.parseInt(sSecondNumber);
        int thirdNumber = Integer.parseInt(sThirdNumber);

        int max, mid, min;

        if (firstNumber > secondNumber && firstNumber > thirdNumber){

            max = firstNumber;

            if (secondNumber > thirdNumber){
                mid = secondNumber;
                min = thirdNumber;
            }else {
                mid = thirdNumber;
                min = secondNumber;
            }
        }else if(secondNumber > thirdNumber){

            max =secondNumber;

            if (firstNumber > thirdNumber){
                mid = firstNumber;
                min = thirdNumber;
            } else {
                mid = thirdNumber;
                min = firstNumber;
            }
        }else {
            max = thirdNumber;
            mid = secondNumber;
            min = firstNumber;
        }
        System.out.println(max + " " + mid + " " + min);
    }
}
