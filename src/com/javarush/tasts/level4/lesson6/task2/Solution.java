package com.javarush.tasts.level4.lesson6.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    /**
     Ввести с клавиатуры четыре числа, и вывести максимальное из них.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sFirstNumber = reader.readLine();
        String sSecondNumber = reader.readLine();
        String sThirdNumber= reader.readLine();
        String sFourthNumber = reader.readLine();

        int firstNumber = Integer.parseInt(sFirstNumber);
        int secondNumber = Integer.parseInt(sSecondNumber);
        int thirdNumber = Integer.parseInt(sThirdNumber);
        int FourthNumber = Integer.parseInt(sFourthNumber);

        if (firstNumber > secondNumber && firstNumber > thirdNumber && firstNumber > FourthNumber){

            System.out.println(firstNumber);

        } else if(secondNumber > thirdNumber && secondNumber > FourthNumber){

            System.out.println(secondNumber);

        } else if(thirdNumber > FourthNumber){

            System.out.println(thirdNumber);

        }else {
            System.out.println(FourthNumber);
        }

    }
}
