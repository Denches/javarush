package com.javarush.tasts.level4.lesson16.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    /**
     Ввести с клавиатуры строку name.
     Ввести с клавиатуры дату рождения (три числа): y, m, d.
     Вывести на экран текст:
     «Меня зовут name
     Я родился d.m.y»

     Пример:
     Меня зовут Вася
     Я родился 15.2.1988
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sYear = reader.readLine();
        String sMonth = reader.readLine();
        String sDay = reader.readLine();

        int y = Integer.parseInt(sYear);
        int m = Integer.parseInt(sMonth);
        int d = Integer.parseInt(sDay);

        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + d + "." + m + "." + y);

    }
}
