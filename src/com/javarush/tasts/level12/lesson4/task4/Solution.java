package com.javarush.tasts.level12.lesson4.task4;

/**
 * Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
 * Каждый метод должен возвращать минимальное из двух переданных в него чисел.
 */

public class Solution {

    public static void main(String[] args) {

        System.out.println(min(1,2));
        System.out.println(min(1L,2L));
        System.out.println(min(1.0,2.0));
    }

    public static int min(int a, int b){
        return Math.min(a, b);
    }
    public static long min(long a, long b){
        return Math.min(a, b);
    }
    public static double min(double a, double b){
        return Math.min(a, b);
    }
}
