package com.javarush.tasts.level6.lesson8.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Сделать класс ConsoleReader, у которого будут 4 статических метода:
 * String readString() – читает с клавиатуры строку
 * int readInt() – читает с клавиатуры число
 * double readDouble() – читает с клавиатуры дробное число
 * boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
 * Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
 */

class ConsoleReader {

    static String readString() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();
    }

    static int readInt() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number = reader.readLine();

        return Integer.parseInt(number);
    }

    static double readDouble() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String doubleNumber = reader.readLine();

        return Double.parseDouble(doubleNumber);
    }

    static boolean readBoolean() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sBoolean = reader.readLine();

        return Boolean.parseBoolean(sBoolean);
    }
}
