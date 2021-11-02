package com.javarush.tasts.level8.lesson11.bonustask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Locale;

/**
 * Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month». Используйте коллекции.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String month = reader.readLine();

        Date date = new Date(month.toUpperCase(Locale.ROOT) + " 1 2021");

        System.out.println(month + " is " + (date.getMonth() + 1) + " month");
    }
}
