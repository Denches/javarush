package com.javarush.tasts.level2.lesson5.task1;

/**
 * Закоментарь несколько строк, чтобы на экран вывелось число 19
 */

public class Solution {

    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        y = y + 3 * x;
        //x = x * 2;
        x = x * 16;
        //y = y + 2 * x;
        y = y + x;

        System.out.println(y);
    }
}
