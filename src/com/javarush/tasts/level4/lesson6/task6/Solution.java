package com.javarush.tasts.level4.lesson6.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    /**
     Ввести с клавиатуры имя и возраст.
     Если возраст больше 20 вывести надпись «И 18-ти достаточно»
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sAge= reader.readLine();

        int age = Integer.parseInt(sAge);

        if (age > 20){
            System.out.println("И 18-ти достаточно");
        }
    }
}
