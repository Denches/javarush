package com.javarush.tasts.level3.lesson8.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    /*
     Ввести с клавиатуры число и имя, вывести на экран строку:
     «имя» захватит мир через «число» лет. Му-ха-ха!
     ( Последовательность вводимых данных имеет большое значение.)

     Пример:
     Вася захватит мир через 8 лет. Му-ха-ха!
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sYear = reader.readLine();

        int year = Integer.parseInt(sYear);

        System.out.println(name + " захватит мир через " + sYear + " лет. Му-ха-ха!");
    }
}
