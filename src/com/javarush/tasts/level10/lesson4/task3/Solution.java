package com.javarush.tasts.level10.lesson4.task3;

/**
 * Добавить одну операцию по преобразованию типа, чтобы получался ответ: b = 0
 * float f = (float)128.50;
 * int i = (int)f;
 * int b = (int)(i + f);
 */

public class Solution {

    public static void main(String[] args) {

        float f = (float) 128.50;
        int i = (byte) f;
        int b = (int) (i + f);

        System.out.println(b);
    }
}
