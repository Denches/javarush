package com.javarush.tasts.level2.lesson8.task1;

/**
 * Написать функцию, которая возвращает минимум из двух чисел.
 */

public class Solution {

    public static void main(String[] args) {

        System.out.println(min(5,3));
    }

    public static int min(int a, int b){
       return Math.min(a, b);
    }
}
