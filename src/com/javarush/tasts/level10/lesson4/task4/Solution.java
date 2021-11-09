package com.javarush.tasts.level10.lesson4.task4;

/**
 * Добавить одну операцию по преобразованию типа, чтобы получался ответ: nine = 9
 * short number = 9;
 * char zero = '0';
 * int nine = (zero + number);
 */

public class Solution {

    public static void main(String[] args) {

        short number = 9;
        char zero = '0';
        int nine = (zero + number);

        System.out.println((char) nine);
    }
}
