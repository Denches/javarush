package com.javarush.tasts.level2.lesson8.task2;

/**
 * Написать функцию, которая возвращает максимум из двух чисел.
 */

public class Solution {

    public static void main(String[] args) {

        System.out.println(max(5,3));
    }

    public static int max(int a, int b){

        return Math.max(a, b);
    }
}
