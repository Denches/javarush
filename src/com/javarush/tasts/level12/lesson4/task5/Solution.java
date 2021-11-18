package com.javarush.tasts.level12.lesson4.task5;

/**
 * Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
 * Каждый метод должен возвращать максимальное из двух переданных в него чисел.
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(max(1,2));
        System.out.println(max(1L,2L));
        System.out.println(max(1.0,2.0));
    }

    public static int max(int a, int b){
        return Math.max(a, b);
    }
    public static long max(long a, long b){
        return Math.max(a, b);
    }
    public static double max(double a, double b){
        return Math.max(a, b);
    }
}
