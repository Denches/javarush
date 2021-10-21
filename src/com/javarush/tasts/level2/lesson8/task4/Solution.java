package com.javarush.tasts.level2.lesson8.task4;

/**
 * Написать функцию, которая вычисляет минимум из четырёх чисел.
 * Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
 */

public class Solution {

    public static void main(String[] args) {

        System.out.println(min(5, 3, 7, 2));
    }

    public static int min(int a, int b, int c, int d){

        return min(min(a, b), min(c, d));
    }

    public static int min(int a, int b){

        return Math.min(a,b);
    }
}
