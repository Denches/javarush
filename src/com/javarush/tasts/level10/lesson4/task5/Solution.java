package com.javarush.tasts.level10.lesson4.task5;

/**
 * Расставьте правильно операторы приведения типа, чтобы получился ответ: c = 256
 * int a = (byte)44;
 * int b = (byte)300;
 * short c = (byte)(b - a);
 */

public class Solution {

    public static void main(String[] args) {

        int a = 44;
        int b = 300;
        short c =(short) (b - a);

        System.out.println(c);
    }
}
